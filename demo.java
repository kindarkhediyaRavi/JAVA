import java.util.Scanner;

class ok
{
    int x,y,z;
    ok(int x,int y)
    {
        z = x + y;
    }
    void disp()
    {
        System.out.println("Sum of "+ z);
    }
}
public class demo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        ok obj = new ok(n,20);
        obj.disp();

        // for(int i=1;i<=10;i++)
        // {
        //     System.out.format("%d * %d = %d \n" , n , i , (n*i));
        // }
        
    }
}