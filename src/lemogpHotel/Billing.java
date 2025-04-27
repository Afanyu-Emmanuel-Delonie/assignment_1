package lemogpHotel;

public class Billing extends HotelServices{
    public Billing(String guessId, String guessName, String roomType, int numDays, String roomStatus) {
        super(guessId, guessName, roomType, numDays, roomStatus);
    }

    @Override
    void bookRoom() {

    }

    @Override
    void checkoutGuest() {

    }

    @Override
    void generateBill() {
        int costPerNight = 0;
        switch(roomType.toUpperCase()){

            case "STANDARD":
                costPerNight = 50000;
                break;
            case "DELUXE":
                costPerNight = 80000;
                break;
            case "SUITE":
                costPerNight = 120000;
                break;
            default:
                System.out.println("Invalid room type.");
                return;
        }

        int totalCost = costPerNight * numDays;
        System.out.println("----- BILL DETAILS -----");
        System.out.println("Guest Name: " + guessName);
        System.out.println("Guest ID: " + guessId);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days Stayed: " + numDays);
        System.out.println("Total Cost: " + totalCost + " RWF");
        System.out.println("-------------------------");

    }
}
