package lemogpHotel;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Guest ID: ");
        String guestId = sc.nextLine();

        System.out.print("Enter Guest Name: ");
        String guestName = sc.nextLine();

        System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        String roomType = sc.nextLine().toUpperCase();

        int stayDays = getValidInt(sc, "Enter Stay Days: ");

        String roomStatus = "AVAILABLE";

        RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays, roomStatus);
        booking.bookRoom();

        if (booking.getRoomStatus().equals("OCCUPIED")) {
            CheckOut checkout = new CheckOut(guestId, guestName, roomType, stayDays, booking.getRoomStatus());
            checkout.checkoutGuest();

            Billing bill = new Billing(guestId, guestName, roomType, stayDays, checkout.getRoomStatus());
            bill.generateBill();
        }

        sc.close();
    }

    // Method to validate integer input
    private static int getValidInt(Scanner sc, String prompt) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                value = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        return value;
    }
}
