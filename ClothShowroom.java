import java.util.Scanner;

public class ClothShowroom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the purchase amount:");
        double purchaseAmount = scanner.nextDouble();

        System.out.println("Enter the type of item (1 for Mill Cloth, 2 for Handloom Items):");
        int itemType = scanner.nextInt();

        double discount = 0;

        switch (itemType) {
            case 1:
                // Mill Cloth
                if (purchaseAmount >= 1 && purchaseAmount <= 100) {
                    discount = 0.05;
                } else if (purchaseAmount > 100 && purchaseAmount <= 200) {
                    discount = 0.05;
                } else if (purchaseAmount > 200 && purchaseAmount <= 300) {
                    discount = 0.075;
                } else if (purchaseAmount > 300) {
                    discount = 0.10;
                }
                break;
            case 2:
                // Handloom Items
                if (purchaseAmount >= 1 && purchaseAmount <= 100) {
                    discount = 0.05;
                } else if (purchaseAmount > 100 && purchaseAmount <= 200) {
                    discount = 0.075;
                } else if (purchaseAmount > 200 && purchaseAmount <= 300) {
                    discount = 0.10;
                } else if (purchaseAmount > 300) {
                    discount = 0.15;
                }
                break;
            default:
                System.out.println("Invalid item type.");
                return;
        }

        double discountAmount = purchaseAmount * discount;
        double netAmount = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Net Amount to be paid: $" + netAmount);

        scanner.close();
    }
}
