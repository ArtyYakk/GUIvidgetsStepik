import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class RadioButton extends JFrame {
    public void run(){
        JFrame frame = new JFrame("Ваш любимый цвет");
        frame.getContentPane().setLayout(new GridLayout(5,1,0,5));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300,200));

        ButtonGroup group = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("blue");
        JRadioButton radio2 = new JRadioButton("white");
        JRadioButton radio3 = new JRadioButton("red");
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        JButton button = new JButton("Ответить");

        JLabel label = new JLabel("Ответ: ");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);

        frame.add(button);
        frame.add(label);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Enumeration<AbstractButton> elements = group.getElements();
                AbstractButton checkBut = null;

                for(int i=0; i<group.getButtonCount(); i++){
                    checkBut = elements.nextElement();
                    if(checkBut.isSelected()) label.setText(checkBut.getText());
                }
            }
        });

        frame.setVisible(true);
        frame.pack();
    }
}
