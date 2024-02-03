
// Interface in default and private method wiht Body
interface shop
{
    void shop1(String s);
    
    default void item(String i) //  Default method given body in interface
    {
        System.out.println("Item name : " + i);
        price(500);
    }
    private void price(int p)   //  Private method given body in interface
    {                           //private method is cannot direct access in main method 
        System.out.println("Price     : " + p); // this access in defauil method
    }
    public void discount(int d);
    
};
class myclass implements shop
{
    public void shop1(String s)
    {
        System.out.println("Shop name : " + s);
    }
    public void discount(int d)
    {
        System.out.println("Discount  : " + d );
    }

};

public class interface_In_MethodBody {
    public static void main(String[] args) {
        myclass m = new myclass();
        m.shop1("Ganesh");
        m.item("Parle-G");
        m.discount(30);
    }
}
