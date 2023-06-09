import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();
        double shippingCost = 0;

        // Input
        if(itemPrice < 100) {
            shippingCost = itemPrice * 0.02;
        }
        // Process
        double totalPrice = itemPrice + shippingCost;

        // Output statements
        System.out.println("The shipping cost is: $" + shippingCost);
        System.out.println("The total price is: $" + totalPrice);
    }
}