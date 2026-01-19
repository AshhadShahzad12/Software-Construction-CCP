import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReserverPayerTest {

    @Test
    void testCreateReserverPayerValid() {
        ReserverPayer payer = ReserverPayer.create("1234-5678-9012", "RP001");

        assertNotNull(payer);
    }

    @Test
    void testCreateReserverPayerWithNullCardThrowsException() {
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                () -> ReserverPayer.create(null, "RP001")
        );

        assertEquals("Invalid reserver payer data", ex.getMessage());
    }

    @Test
    void testCreateReserverPayerWithNullIdThrowsException() {
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                () -> ReserverPayer.create("1234-5678-9012", null)
        );

        assertEquals("Invalid reserver payer data", ex.getMessage());
    }

    @Test
    void testCreateReserverPayerWithBothNullThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ReserverPayer.create(null, null)
        );
    }
}