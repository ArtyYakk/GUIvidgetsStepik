import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));

        JTextField field = new JTextField();

        Font font = new Font(Font.MONOSPACED, Font.PLAIN,20);

        JButton n1 = new JButton("1");
        n1.setFont(font);
        JButton n2 = new JButton("2");
        n2.setFont(font);
        JButton n3 = new JButton("3");
        n3.setFont(font);
        JButton plus = new JButton("+");
        plus.setFont(font);
        JButton n4 = new JButton("4");
        n4.setFont(font);
        JButton n5 = new JButton("5");
        n5.setFont(font);
        JButton n6 = new JButton("6");
        n6.setFont(font);
        JButton minus = new JButton("-");
        minus.setFont(font);
        JButton n7 = new JButton("7");
        n7.setFont(font);
        JButton n8 = new JButton("8");
        n8.setFont(font);
        JButton n9 = new JButton("9");
        n9.setFont(font);
        JButton multiply = new JButton("*");
        multiply.setFont(font);
        JButton c = new JButton("C");
        c.setFont(font);
        JButton n0 = new JButton("0");
        n0.setFont(font);
        JButton equal = new JButton("=");
        equal.setFont(font);
        JButton divide = new JButton("/");
        divide.setFont(font);

        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        panel.add(plus);
        panel.add(n4);
        panel.add(n5);
        panel.add(n6);
        panel.add(minus);
        panel.add(n7);
        panel.add(n8);
        panel.add(n9);
        panel.add(multiply);
        panel.add(c);
        panel.add(n0);
        panel.add(equal);
        panel.add(divide);

        frame.add(field,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);

        field.setPreferredSize(new Dimension(frame.getWidth(),40));

        frame.setVisible(true);
        frame.pack();
    }
}
