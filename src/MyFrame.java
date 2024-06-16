import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        super("Picture car");
        setBounds(500, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        MyPanel panel = new MyPanel();
        Container container = getContentPane();
        container.add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
