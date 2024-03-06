
// Frame make in two type 
// 1.Inheritance
// 2.Asocciation

// Using Inheritance
import java.awt.*;

public class DemoFrame extends Frame {
    DemoFrame(String s, int i, int j) {
        super(s);
        setSize(i, j);
        setVisible(true);
    }


    public static void main(String[] args) {
        new DemoFrame("First Frame", 300, 300);
        new DemoFrame("First Frame", 500, 500);
    }
}
