import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {

                System.out.println("===== HOTEL RESERVATION SYSTEM STARTED =====");

                // 1. Create Hotel Chain
                HotelChain chain = new HotelChain("Luxury Chain");
                System.out.println("Hotel Chain created.");

                // 2. Create Hotel
                Hotel hotel = new Hotel("Grand Hotel");
                System.out.println("Hotel created: " + hotel.getHotelName());

                // 3. Create Rooms
                Room room101 = new Room(101);
                Room room102 = new Room(102);
                System.out.println("Rooms created: 101, 102");

                // 4. Create Guests
                Guest guest1 = Guest.create("Ali", "Karachi");

                Guest guest2 = Guest.create("Ahmed", "Lahore");

                System.out.println("Guests created: Ali & Ahmed");

                // 5. Assign Guest 1 to Room 101
                System.out.println("\n--- Assigning Ali to Room 101 ---");
                room101.assignGuest(guest1);

                // 6. Try assigning Guest 2 to SAME Room 101
                System.out.println("\n--- Trying to assign Ahmed to SAME Room 101 ---");
                room101.assignGuest(guest2);

                // 7. Assign Guest 2 to Room 102
                System.out.println("\n--- Assigning Ahmed to Room 102 ---");
                room102.assignGuest(guest2);

                // 8. Create Reservation
                System.out.println("\n--- Creating Reservation ---");
                Reservation reservation = Reservation.create(
                                LocalDate.now(),
                                LocalDate.now().plusDays(2),
                                101);
                System.out.println("Reservation created successfully.");

                // 9. Payment
                // CreditCard card = new CreditCard("1234567890");
                ReserverPayer payer = ReserverPayer.create("1234567890", "1");
                System.out.println("Reservation payment completed with detail: " + payer);
        }
}