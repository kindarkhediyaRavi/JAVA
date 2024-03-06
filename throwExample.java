import java.util.Scanner;

public class throwExample {
    public static void main(String[] args) {
        try {
            // Get a number from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number greater than 10: ");
            int userInput = scanner.nextInt();

            // Check if the entered number is greater than 10
            if (userInput <= 10) {
                // If not, throw an exception
                throw new IllegalArgumentException("Number must be greater than 10");
            }

            // If the number is greater than 10, display a message
            System.out.println("You entered: " + userInput);

        } catch (IllegalArgumentException e) {
            // Catch and handle the exception
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
