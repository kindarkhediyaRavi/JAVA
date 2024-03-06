import java.awt.Frame;
import java.awt.*;

public class calc {

    Frame f;
    Label l1;
    TextField tf1;
    Button btn1;

    calc(String s){
        f = new Frame("Calculater");

        l1 = new Label("Calculater");
        l1.setBounds(100,100,100,100);
        f.add(l1);

        Toolkit t = f.getToolkit();
        Dimension ScrSize = t.getScreenSize();
        int width = ScrSize.width * 8 / 10;
        int height = ScrSize.height * 8 / 10;
        f.setBounds(width/8, height/20, width, height);

        f.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        calc c1 = new calc("**Calculater**");
    }
}
