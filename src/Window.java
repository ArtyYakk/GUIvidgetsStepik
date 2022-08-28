import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {
    public void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000,800));
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Жми кнопку снизу");
        label.setFont(new Font(Font.MONOSPACED, Font.ITALIC,50));
        label.setLocation(500,800);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Кликер");
        final int[] clickCount = {0};

        JSlider slider = new JSlider(JSlider.HORIZONTAL,5,100,50);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setFont(new Font(Font.MONOSPACED, Font.ITALIC, slider.getValue()));
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount[0]++;
                label.setText(String.valueOf(clickCount[0]));
            }
        });


        frame.add(label, BorderLayout.CENTER);
        frame.add(slider, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);


        frame.setVisible(true);
        frame.pack();
    }
}
