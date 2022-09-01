import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame {
    public void run(){
        JFrame frame = new JFrame("Ваш любимый цвет");
        frame.getContentPane().setLayout(new GridLayout(3,1,0,5));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,300));

        JTextField field = new JTextField();

        JButton button = new JButton("Записать");

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        frame.add(field);
        frame.add(scroll);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append(field.getText() + "\n");
                field.setText("");
            }
        });

        frame.setVisible(true);
        frame.pack();
    }
}
