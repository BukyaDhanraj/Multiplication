import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform multiplication
        int result = num1 * num2;

        // Display the result
        System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

