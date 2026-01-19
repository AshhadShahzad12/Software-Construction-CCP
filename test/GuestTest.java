import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void testCreateGuestSuccessfully() {
        Guest guest = Guest.create("Ali", "Karachi");

        assertNotNull(guest);
        assertEquals("Ali", guest.getGuestName());
    }

    @Test
    void testNullNameThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Guest.create(null, "Karachi")
        );

        assertEquals("Invalid guest data", exception.getMessage());
    }

    @Test
    void testNullAddressThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Guest.create("Ali", null)
        );

        assertEquals("Invalid guest data", exception.getMessage());
    }

    @Test
    void testBothNullThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Guest.create(null, null)
        );
    }
}