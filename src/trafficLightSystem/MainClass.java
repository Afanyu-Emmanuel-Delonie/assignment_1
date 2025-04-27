package trafficLightSystem;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver ID (16 digits National ID or License No): ");
        String driverId = sc.nextLine();
        while (!driverId.matches("\\d{16}")) {
            System.out.print("Invalid ID. Please enter exactly 16 digits: ");
            driverId = sc.nextLine();
        }

        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
        String vehiclePlate = sc.nextLine();
        while (!vehiclePlate.matches("[A-Z]{3}\\d{3}[A-Z]")) {
            System.out.print("Invalid plate format. Please enter like RAB123D: ");
            vehiclePlate = sc.nextLine();
        }

        System.out.print("Enter Violation Type (SPEEDING/RED_LIGHT/NO_HELMET/DUI): ");
        String violationType = sc.nextLine().toUpperCase();

        // Step 1: Record Violation
        VoilationEntry entry = new VoilationEntry(driverId, driverName, vehiclePlate, violationType);
        entry.recordViolation();

        // Step 2: Assess Fine
        FineAssessment assessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
        assessment.assessFine();

        // Step 3: Process Payment
        FinePayment payment = new FinePayment(driverId, driverName, vehiclePlate, violationType, assessment.fineAmount, entry.paymentStatus);

        System.out.print("\nDo you want to pay the fine now? (yes/no): ");
        String payNow = sc.nextLine();
        if (payNow.equalsIgnoreCase("yes")) {
            payment.processPayment();
        } else {
            System.out.println("\nPayment pending. Please pay later to avoid penalties.");
        }

        sc.close();
    }
}
