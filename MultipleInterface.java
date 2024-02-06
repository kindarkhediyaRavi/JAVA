import java.time.LocalDate;

class ok
{
    void Horn(int t)
    {
        System.out.println("Horn : " + t);
    }
}
interface Motor extends referToDate{ // interface in Inherite the interface So using "extends" Keyword
    int id = 6;
    String name = "ravi";
    void BreakUp(int d);
    void SpedUp(int o);
    void currDate();    // Same Method implement in Both Interface
};
interface referToDate  {
    void currDate();
}
class myclass implements Motor,referToDate
{
    LocalDate ld = LocalDate.now();
    public void currDate()
    {
        System.out.println("Current Date is " + ld);
    }
    public void BreakUp(int d)
    {
        System.out.println("Drecrement the Speed " + d);
    }
    public void SpedUp(int i)
    {
        System.out.println("Increment the Speed " + i);
    }
    void extraMethod()
    {
        System.out.println("Welcome");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        myclass m = new myclass();
        m.BreakUp(10);
        m.SpedUp(50);
        m.extraMethod();
        m.currDate();
        // you can create a property in interface
        // you canot modify a property Interface in they are Final
        System.out.println("Id : " + m.id);  // interface in dayre ct variable access is allowed... 
        System.out.println("Name : " + m.name);
    }
}
