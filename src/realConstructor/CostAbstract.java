package realConstructor;

abstract class CostAbstract {
    String contractorId;
    String contractorName;
    double materialQuantity;
    double materialBalance;

    public CostAbstract(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialQuantity = materialQuantity;
        this.materialBalance = materialBalance;
    }

    public abstract void  receivedMaterial();
    public abstract  void useMaterial();
    public abstract void estimatedCost();

}
