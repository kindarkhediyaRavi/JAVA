import java.util.Scanner;

class myclass 
{
    public void add(int a, int b)
    {
        System.out.println("\nThe Answer is " + (a+b));
    }
    public void mul(int a, int b)
    {
        System.out.println("The Answer is " + (a*b));
    }
    public void sub(int a, int b)
    {
        System.out.println("The Answer is " + (a-b));
    }
    public void div(int a, int b)
    {
        System.out.println("The Answer is " + (a/b));
    }
}

public class calculater {
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        a = sc.nextInt();
        System.out.print("Enter Value : ");
        b = sc.nextInt();

        myclass m = new myclass();
        m.add(a, b);
        m.sub(a, b);
        m.mul(a, b);
        m.div(a, b);
    }
}
