import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testValidRoomNumber() {
        Room room = new Room(101);
        assertEquals(101, room.getNumber());
        assertFalse(room.isOccupied());
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, -1, -10 })
    void testInvalidRoomNumberThrowsException(int number) {
        assertThrows(IllegalArgumentException.class, () -> new Room(number));
    }

    @Test
    void testAssignGuestSuccessfully() {
        Room room = new Room(101);
        Guest guest = Guest.create("Ali", "Karachi");

        boolean result = room.assignGuest(guest);

        assertTrue(result);
        assertTrue(room.isOccupied());
    }

    @Test
    void testAssignNullGuestFails() {
        Room room = new Room(101);

        boolean result = room.assignGuest(null);

        assertFalse(result);
        assertFalse(room.isOccupied());
    }

    @Test
    void testAssignGuestToOccupiedRoomFails() {
        Room room = new Room(101);

        Guest guest1 = Guest.create("Ali", "Karachi");
        Guest guest2 = Guest.create("Ahmed", "Lahore");

        assertTrue(room.assignGuest(guest1));
        assertFalse(room.assignGuest(guest2));
    }
}