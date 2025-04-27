package realConstructor;

public class MaterialDelivary extends CostAbstract{


    public MaterialDelivary(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receivedMaterial() {
        if(materialQuantity >= 1 && materialQuantity <= 10){
            materialBalance += materialQuantity;
            System.out.println("Material quantity is " + materialQuantity  + " Tone");
        }else{
            System.out.println("Sorry quantity is out of range ( 1 - 10 tones )");
        }
    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimatedCost() {

    }
}
