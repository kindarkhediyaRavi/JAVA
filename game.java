import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        // 1 for ston
        // 2 for paper
        // 3 for scissor
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Ston, 2 for Paper and 3 for Scissor ");
        int userInput  = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt( 3);

        if (userInput == computerInput) {
            System.out.println("Draw...");
        }
        else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1
                    || userInput == 3 && computerInput == 2) {
            System.out.println("You Win...");
        }
        else{
            System.out.println("Computer Win...");
        }

        System.out.println("Computer Choice :  " + computerInput);
        if(computerInput == 1){
            System.out.println("Computer Choice Ston");
        }
        else if(computerInput == 2){
            System.out.println("Computer Choice Paper");
        }
        else if(computerInput == 3){
            System.out.println("Computer Choice Scissor");
        }
    }
}
