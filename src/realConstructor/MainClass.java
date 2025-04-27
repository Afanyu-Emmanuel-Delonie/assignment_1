package realConstructor;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Contractor ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Contractor Name: ");
        String name = scanner.nextLine();

        double quantity = getValidDouble(scanner, "Enter Material Quantity (tons): ");
        double balance = getValidDouble(scanner, "Enter Initial Material Balance (tons): ");

        // Collecting materials
        MaterialDelivary material = new MaterialDelivary(id, name, quantity, balance);
        material.receivedMaterial();

        // Usage
        double used = getValidDouble(scanner, "Enter Used Material Amount (tons): ");
        MaterialUsage usage = new MaterialUsage(id, name, quantity, material.materialBalance, used);
        usage.useMaterial();

        // Cost Estimation Simulation
        CostEstimator cost = new CostEstimator(id, name, quantity, usage.materialBalance);
        cost.estimatedCost();

        scanner.close();
    }


    private static double getValidDouble(Scanner scanner, String prompt) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number (e.g., 12.5).");
            }
        }

        return value;
    }
}
