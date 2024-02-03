import java.util.Random;
import java.util.Scanner;

public class chooseValueGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter a number: ");
            int userValue = scanner.nextInt();

            int randomValue = random.nextInt(20) + 1; 

            System.out.println("Random value: " + randomValue);

            if (userValue == randomValue) {
                System.out.println("Congratulations! You win!");
                break; 
            } else {
                System.out.println("Try again. Values do not match.");
            }
        }

        // scanner.close();
    }
}
