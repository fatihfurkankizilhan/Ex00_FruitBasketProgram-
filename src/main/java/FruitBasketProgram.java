import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitBasketProgram {
    public static void main(String[] args) {
        Map<String, Double> fruits = new HashMap<>();
        fruits.put("apple", 2.0);
        fruits.put("pear", 3.0);
        fruits.put("banana", 1.5);
        fruits.put("orange", 2.5);

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;

        System.out.println("Welcome to the Fruit Basket!");

        while (true) {
            System.out.println("Enter the fruit name or type 'done' to finish:");
            String fruitName = scanner.nextLine().toLowerCase();

            if (fruitName.equals("done")) {
                break;
            }

            if (fruits.containsKey(fruitName)) {
                double price = fruits.get(fruitName);
                System.out.println(fruitName + " price: " + price + " TL");
                totalPrice += price;
            } else {
                System.out.println("Invalid fruit name! Please try again.");
            }
        }

        System.out.println("Fruits in your basket and total price:");
        System.out.println("Total Price: " + totalPrice + " TL");

        scanner.close();
    }
}