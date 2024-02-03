class one
{
    static void get(int ...arr)
    {
        for (int a : arr)
        {
            System.out.print(a + " ");
        }
    }
}
public class arrayArgument {
    public static void main(String[] args) {
        one objOne = new one();
        objOne.get(10);
        System.out.println();        
        objOne.get(10,20);        
        System.out.println();        
        objOne.get(10,20,30,3,5,6,77);        
    }
}
