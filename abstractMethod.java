
abstract class month
{
    void Month(int m)
    {
        System.out.println("Month is " + m);
    }
    abstract void absMethod();
};
class day extends month  {
    void totalDay()
    {
        System.out.println("Day ");
    }
    @Override
    void absMethod() {
        System.out.println("Printed abstract Method...");
    }
};

public class abstractMethod {
    public static void main(String[] a)
    {
        day d = new day();
        d.Month(5);
        d.totalDay();
        d.absMethod();
    }
}
