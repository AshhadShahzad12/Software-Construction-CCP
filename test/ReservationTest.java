import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void testValidReservation() {
        assertNotNull(
            Reservation.create(LocalDate.now(), LocalDate.now().plusDays(1), 1)
        );
    }
}