package realConstructor;

public class CostEstimator extends CostAbstract{

    public CostEstimator(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receivedMaterial() {

    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimatedCost() {
        double costPerTon = 0;
        if (materialQuantity >= 5 && materialQuantity <= 15) {
            costPerTon = 200000;
        } else if (materialQuantity > 15) {
            costPerTon = 180000;
        } else {
            System.out.println("Quantity too low to estimate cost.");
            return;
        }

        double totalCost = materialQuantity * costPerTon;
        System.out.println("----- Cost Estimation -----");
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Contractor Name: " + contractorName);
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.printf("Total Cost: RWF %, .2f\n", totalCost);
    }
}
