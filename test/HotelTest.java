import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelChainTest {

    @Test
    void testAddHotel() {
        HotelChain chain = new HotelChain("Luxury");
        Hotel h = new Hotel("Grand");
        chain.addHotel(h);
        assertNotNull(h);
    }

    @Test
    void testCreateReservationPayer() {
        HotelChain chain = new HotelChain("Luxury");
        CreditCard card = new CreditCard("1234567890");
        ReserverPayer payer = chain.createReservationPayer("1234567890", "1");
    }
}