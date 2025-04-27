package lemogpHotel;

public abstract class HotelServices {
    protected String guessId;
    protected String guessName;
    protected  String roomType;
    protected int numDays;



    protected  String roomStatus;

    public HotelServices(String guessId, String guessName, String roomType, int numDays, String roomStatus) {
        this.guessId = guessId;
        this.guessName = guessName;
        this.roomType = roomType;
        this.numDays = numDays;
        this.roomStatus = roomStatus;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public int getNumDays() {
        return numDays;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getGuessName() {
        return guessName;
    }

    public String getGuessId() {
        return guessId;
    }

    abstract void bookRoom();
    abstract void checkoutGuest();
    abstract void generateBill();

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
}
