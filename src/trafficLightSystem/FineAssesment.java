package trafficLightSystem;

class FineAssessment extends TrafficRecord {

    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("\nUnknown violation type. Cannot assess fine.");
                return;
        }

        System.out.println("\nFine Assessment Completed:");
        System.out.println("Driver Name: " + driverName);
        System.out.println("Vehicle Plate: " + vehiclePlate);
        System.out.println("Violation Type: " + violationType);
        System.out.println("Fine Amount: " + fineAmount + " RWF");
    }

    @Override
    public void recordViolation() {}

    @Override
    public void processPayment() {}
}
