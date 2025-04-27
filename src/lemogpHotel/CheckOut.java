package lemogpHotel;

public class CheckOut extends HotelServices{
    public CheckOut(String guessId, String guessName, String roomType, int numDays, String roomStatus) {
        super(guessId, guessName, roomType, numDays, roomStatus);
    }

    @Override
    void bookRoom() {

    }

    @Override
    void checkoutGuest() {
        if(roomStatus.equalsIgnoreCase("OCCUPIED")){
            roomStatus = "AVAILABLE";
            System.out.println("Thank you and hope you enjoyed your stay " + guessName);
        }else{
            System.out.println("Sorry: the room was already available");
        }
    }

    @Override
    void generateBill() {

    }
}
