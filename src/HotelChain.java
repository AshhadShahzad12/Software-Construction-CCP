import java.util.ArrayList;
import java.util.List;

public class HotelChain {

    private final String name;
    private final List<Hotel> hotels = new ArrayList<>();

    public HotelChain(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("HotelChain name required");
        }
        this.name = name;
    }

    public void addHotel(Hotel hotel) {
        if (hotel != null) {
            hotels.add(hotel);
        }
    }

    public ReserverPayer createReservationPayer(String card, String id) {
        return ReserverPayer.create(card, id);
    }
}