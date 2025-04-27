package trafficLightSystem;

class VoilationEntry extends TrafficRecord {



    public VoilationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        if (violationType.equalsIgnoreCase("SPEEDING") ||
                violationType.equalsIgnoreCase("RED_LIGHT") ||
                violationType.equalsIgnoreCase("NO_HELMET") ||
                violationType.equalsIgnoreCase("DUI")) {

            paymentStatus = "UNPAID";
            System.out.println("\nViolation recorded successfully!");
            System.out.println("Driver Name: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Violation Type: " + violationType);
            System.out.println("Payment Status: " + paymentStatus);
        } else {
            System.out.println("\nInvalid violation type. Allowed types: SPEEDING, RED_LIGHT, NO_HELMET, DUI.");
        }
    }

    @Override
    public void assessFine() {}

    @Override
    public void processPayment() {}
}