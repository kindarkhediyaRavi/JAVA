import java.util.Scanner;

public class ExceptionUsingArray {
    public static void main(String[] args) {
        
        int[]  marks = {7,56,6};
        Scanner sc = new Scanner(System.in);

        System.out.println("Which index to devide value : ");
        int ind = sc.nextInt();
        System.out.println("Enter devide Number : ");
        int number = sc.nextInt();

        try  {
            System.out.println("The Result is : " + marks[ind]/number);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Array Index of Bounce Error ");
            System.out.println(e);
        }
        
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Error ");
            System.out.println(e);
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some Other Error ");
            System.out.println(e);
        }
    }
}
