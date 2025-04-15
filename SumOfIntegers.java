import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Autoboxing: Convert string inputs to Integer objects
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part); // Unboxing is automatic
                numbers.add(num); // Autoboxing: int -> Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + part + " is not a number.");
                return;
            }
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer -> int
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
