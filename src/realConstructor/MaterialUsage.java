package realConstructor;

public class MaterialUsage extends CostAbstract{
    private double usedAmount;

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance, double used) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
        this.usedAmount = usedAmount;
    }

    @Override
    public void receivedMaterial() {

    }

    @Override
    public void useMaterial() {
        if( materialBalance - usedAmount  >= 2){
            materialBalance -= usedAmount;
            System.out.println("the amount of materials left is " + materialBalance + " Tones");
        }
    }

    @Override
    public void estimatedCost() {

    }
}
