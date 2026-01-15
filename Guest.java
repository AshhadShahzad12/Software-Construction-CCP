public class Guest {

    private String name; // Name
    private String addressDetails; // Address

    private Guest(String name, String addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public static Guest create(String name, String addressDetails) {
        if (name == null || addressDetails == null) {
            throw new IllegalArgumentException("Invalid guest data");
        }
        return new Guest(name, addressDetails);
    }
}
