
import java.awt.*;
import java.awt.event.*;
public class AWT_Example {

    Frame f;
    Label l,l2;
    TextField tf;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpluse,bsub,bmul,bdiv,bequal,bclose;
    
    AWT_Example(String s){
        f = new Frame("Example");
        
        // Heading
        l2 = new Label("Calculator");
        l2.setBounds(230,50,60,10);
        f.add(l2);

        // TextField
        tf = new TextField();
        tf.setBounds(50,100,260,40);
        f.add(tf);
        
        b1 = new Button("1");
        b1.setBounds(50,180,50,50);
        f.add(b1);

        b2 = new Button("2");
        b2.setBounds(120,180,50,50);
        f.add(b2);

        b3 = new Button("3");
        b3.setBounds(190,180,50,50);
        f.add(b3);

        b4 = new Button("4");
        b4.setBounds(260,180,50,50);
        f.add(b4);

        
        b5 = new Button("5");
        b5.setBounds(50,250,50,50);
        f.add(b5);

        b6 = new Button("6");
        b6.setBounds(120,250,50,50);
        f.add(b6);

        b7 = new Button("7");
        b7.setBounds(190,250,50,50);
        f.add(b7);

        b8 = new Button("8");
        b8.setBounds(260,250,50,50);
        f.add(b8);

        
        bequal = new Button("=");
        bequal.setBounds(50,320,50,50);
        f.add(bequal);

        b9 = new Button("9");
        b9.setBounds(120,320,50,50);
        f.add(b9);

        b0 = new Button("0");
        b0.setBounds(190,320,50,50);
        f.add(b0);

        bclose = new Button("Close");
        bclose.setBounds(260,320,50,50);
        f.add(bclose);

        bpluse = new Button("+");
        bpluse.setBounds(50,390,50,50);
        f.add(bpluse);

        bsub = new Button("-");
        bsub.setBounds(120,390,50,50);
        f.add(bsub);
        
        bmul = new Button("*");
        bmul.setBounds(190,390,50,50);
        f.add(bmul);

        bdiv = new Button("/");
        bdiv.setBounds(260,390,50,50);
        f.add(bdiv);

        f.setLayout(null);
        // f.setSize(400,400);
        Toolkit t = f.getToolkit();
        Dimension ScreenSize = t.getScreenSize();
        int width = ScreenSize.width * 8/10;
        int height = ScreenSize.height * 8/10;
        f.setBounds(width/40, height/60, width/3, height * 5 / 6);

        // Close button
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        AWT_Example obj = new AWT_Example("Example Second");
        
    }
}
