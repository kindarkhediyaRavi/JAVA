
//  Exception Type In Java --> 1.Cheked (Compile Time)
//                             2.Unched (Run Time)

public class Expesion1 {
    public static void main(String[] args) {
        

        int a = 12;
        int b = 0;
        // int c = a / b;// error show
        
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO handle exception
            System.out.println("We Failed to Drive");
            // System.out.println(e);   // error show 

        }

        
    }
}
