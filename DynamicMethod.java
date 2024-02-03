import java.util.Scanner;

class one  {
    one()
    {
        System.out.println("One Class in Constructor is Called...");
    }
    public void get()
    {
        System.out.println("Class One in Get Method Called...");
    }   
    public void putOne()
    {
        System.out.println("Class One in Put Method Called ...");
    } 
}

class two extends one  
{
    public void get()
    {
        System.out.println("Class Two in Get Method Called...");
    }    
    public void putTwo()
    {
        System.out.println("Class Two in Put Method Called ...");
    }
}
public class DynamicMethod {
    public static void main(String[] args) {
        one o = new two();
        o.get(); // called class two in get method because create object to two Class 
        o.putOne(); 
        // o.putTwo();  // this is not valid
    }
}
