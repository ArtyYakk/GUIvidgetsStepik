import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Window extends JFrame {
    public void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,800));
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Моя первая надпись");
        label.setFont(new Font(Font.MONOSPACED, Font.ITALIC,50));
        label.setLocation(500,800);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JSlider slider = new JSlider(JSlider.HORIZONTAL,5,100,50);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setFont(new Font(Font.MONOSPACED, Font.ITALIC, slider.getValue()));
            }
        });


        frame.add(label, BorderLayout.CENTER);
        frame.add(slider, BorderLayout.NORTH);


        frame.setVisible(true);
        frame.pack();
    }
}
