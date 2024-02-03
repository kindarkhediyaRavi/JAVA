import java.util.Scanner;
import java.util.Random;

class Game {
    public int ci, ui,count=0;

    Game() {
        Random rd = new Random();
        ci = rd.nextInt(100);
        System.out.println("Random Value is ==> " + ci);
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number between 1 to 100 : ");
        ui = sc.nextInt();
    }

    public void answer() {
        while (true) {
            count++;
            if (ci == ui) {
                System.out.println("You are Winner...");
                break;
            } else {
                if (ci > ui) {
                    System.out.println("Your Value is Small...");

                } else {
                    System.out.println("Your Value is Big...");
                    
                }
                userInput();
            }
        }
    }
}

public class GussesGame {
    public static void main(String[] args) {
        Game g = new Game();
        g.userInput();
        g.answer();
        System.out.println("you entered value is ===> " + g.count);
    }
}
