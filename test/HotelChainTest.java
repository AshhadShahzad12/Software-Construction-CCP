import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelChainTest {

    @Test
    void testCreatePayer() {
        HotelChain chain = new HotelChain("Luxury");
        CreditCard card = new CreditCard("1234567890");
        assertNotNull(chain.createReservationPayer("1234567890", "1"));
    }
}