// Default Constructor
// Parameterized Constructor

import java.util.Scanner;
class myclass {
    double x,y;
    myclass(int x,int y) //Parameterized Constructor
    {
        System.out.println("Sum of X and Y ==> " + (x+y));
    }
    myclass()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name  = sc.nextLine();
        System.out.println("Your Name is "+ name);
    }
};

public class constructor {
    public static void main(String[] args) {
        myclass obj = new myclass();            // default constructor call
        myclass obj1 = new myclass(12,2);   // Parameterized constructor call
        System.out.println("Hello...");

    }
}
