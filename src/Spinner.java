import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spinner extends JFrame {
    public void run(){
        JFrame frame = new JFrame("Сколько книг?");
        frame.getContentPane().setLayout(new GridLayout(3,1,0,5));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));


        JSpinner spinner = new JSpinner();

        JButton button = new JButton("Ответить");

        JLabel label = new JLabel("Ответ: ");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Ответ: " + spinner.getValue().toString());
            }
        });


        frame.add(spinner);
        frame.add(button);
        frame.add(label);


        frame.setVisible(true);
        frame.pack();
    }
}
