import java.util.Scanner;

public class jagged1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows entered : " );
        int rows = sc.nextInt();

        int array[][] = new int[rows][];
        for (int i = 0; i < rows; i++) 
        {
            System.out.println("How many columns entered in row no "+ (i+1) +" : ");
            int columnLength = sc.nextInt();

            array[i] = new int [columnLength];
            System.out.println("Enter  column  no " + (i+1) + " ==>  ");

            for (int j = 0; j < columnLength; j++) 
            {
                array[i][j] = sc.nextInt();
            }
        }

        // Display the ArrayList
        System.out.println("\n*** ArrayList *** ");
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++) 
            {
                System.out.print(array[i][j] + " " );    
            }
            System.out.println();
        }
        sc.close();
    }    
}