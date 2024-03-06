

// Association
import java.awt.*;

public class DemoFrame2 {

    Frame f;
    DemoFrame2(String s){
        f = new Frame(s);
        f.setSize(400,200);
        f.setVisible(true);
    }   
    
    public static void main(String[] args) {
        new DemoFrame2("Association");
        // Frame f = new Frame("Hellloooo");
        // f.setSize(300,300);
        // f.setVisible(true);
    }
}
