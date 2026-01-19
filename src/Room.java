public class Room {

    private final int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid room number");
        }
        this.number = number;
    }

    public boolean assignGuest(Guest guest) {
        if (guest == null) return false;
        if (occupant != null) return false;

        occupant = guest;
        return true;
    }

    public boolean isOccupied() {
        return occupant != null;
    }

    public int getNumber() {
        return number;
    }
}