import java.time.LocalDate;

public class Hotel {

    private String name;

    public Hotel(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel name required");
        }
        this.name = name;
    }

    public Reservation createReservation(LocalDate startDate,
            LocalDate endDate,
            int number) {
        return Reservation.create(startDate, endDate, number);
    }

    public boolean available(Room room) {
        return room != null && !room.isOccupied();
    }
}