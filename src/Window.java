import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,800));
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("      Моя первая надпись");
        label.setFont(new Font(Font.MONOSPACED, Font.ITALIC,50));

        frame.add(label, BorderLayout.CENTER);


        frame.setVisible(true);
        frame.pack();
    }
}
