package trafficLightSystem;

class FinePayment extends TrafficRecord {

    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("PAID")) {
            System.out.println("\nError: Fine has already been paid!");
        } else {
            paymentStatus = "PAID";
            System.out.println("\nPayment Successful!");
            System.out.println("Receipt:");
            System.out.println("Driver Name: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Amount Paid: " + fineAmount + " RWF");
            System.out.println("Payment Status: " + paymentStatus);
        }
    }

    @Override
    public void recordViolation() {}

    @Override
    public void assessFine() {}
}
