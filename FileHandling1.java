import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling1 {
    public static void main(String[] args) throws Exception{

        // // Create a File
        String file = "top.txt";
        File f1  = new File(file);
        // f1.createNewFile();

/*        // // Write a File
        FileWriter fw = new FileWriter(file);
        fw.write("Hello my name is Ravi\n");
        fw.write("Hello my name is avi");
        fw.close();

        // // Read a File
        Scanner sc = new Scanner(f1);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
 */
        // // Delete a File
        if (f1.delete()) {
            System.out.println("File Deleted...");
        }
        else{
            System.out.println("Some Problem");
        }
    }
}
