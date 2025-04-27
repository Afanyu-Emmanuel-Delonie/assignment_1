package lemogpHotel;

public class RoomBooking extends HotelServices{
    public RoomBooking(String guessId, String guessName, String roomType, int numDays, String roomStatus) {
        super(guessId, guessName, roomType, numDays, roomStatus);
    }

    @Override
    void bookRoom() {
        if(numDays < 1 || numDays > 30){
            System.out.println("Sorry: You can only book between");
            return;
        }

        if(roomStatus.equalsIgnoreCase("AVAILABLE")){
            roomStatus = "OCCUPIED";
            System.out.println("Room has been booked successfully for " + guessName );
        }else{
            System.out.println("Sorry room is occupied");
        }
    }

    @Override
    void checkoutGuest() {}

    @Override
    void generateBill() {}
}
