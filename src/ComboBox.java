import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {

    private boolean state = false;
    public void run(){
        JFrame frame = new JFrame("???");
        frame.getContentPane().setLayout(new GridLayout(5,1,0,5));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));


        JButton button = new JButton("Ответить");

        JLabel label = new JLabel("Ответ: ");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JComboBox<String> combo = new JComboBox<String>(new String[]{"Серый","Бурый","Малиновый"});

        JCheckBox check = new JCheckBox("Свой вариант");
        check.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField text = new JTextField();
        text.setEnabled(state);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(state) label.setText("Ответ: " + text.getText());
                else label.setText("Ответ: " + combo.getSelectedItem());
            }
        });


        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = !state;
                text.setEnabled(state);
            }
        });

        frame.add(combo);
        frame.add(check);
        frame.add(text);
        frame.add(button);
        frame.add(label);


        frame.setVisible(true);
        frame.pack();
    }
}
