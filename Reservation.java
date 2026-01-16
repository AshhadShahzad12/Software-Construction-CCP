import java.time.LocalDate;

public class Reservation {

    private LocalDate reservationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private int number;

    private Reservation(LocalDate reservationDate,
            LocalDate startDate,
            LocalDate endDate,
            int number) {

        if (!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("Invalid reservation dates");
        }

        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(LocalDate startDate,
            LocalDate endDate,
            int number) {

        return new Reservation(LocalDate.now(), startDate, endDate, number);
    }
}
