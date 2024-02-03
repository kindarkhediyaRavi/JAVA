import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user through get rows 
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        // set rows value in array
        int[][] jaggedArray = new int[numRows][];
        // set column   
        for (int i = 0; i < numRows; i++) 
        {
            System.out.print("Enter the number of Element for row " + (i + 1) + ": ");
            int rowLength = scanner.nextInt();
            
            jaggedArray[i] = new int[rowLength];
            
            System.out.print("Enter " + rowLength + " elements for row " + (i + 1) + ": ");
            // new for loop start
            for (int j = 0; j < rowLength; j++) 
            {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the result
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) 
        {
            for (int j = 0; j < jaggedArray[i] .length; j++) 
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
