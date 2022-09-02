import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Calculator extends JFrame {
    JTextField field;
    StringBuffer buf = new StringBuffer("");
    String[] x = new String[]{"","",""};
    public void run(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));

        field = new JTextField();

        Font font = new Font(Font.MONOSPACED, Font.PLAIN,20);

        JButton n1 = new JButton("1");
        n1.setFont(font);
        n1.addActionListener(new Listener());

        JButton n2 = new JButton("2");
        n2.setFont(font);
        n2.addActionListener(new Listener());

        JButton n3 = new JButton("3");
        n3.setFont(font);
        n3.addActionListener(new Listener());

        JButton plus = new JButton("+");
        plus.setFont(font);
        plus.addActionListener(new Listener());

        JButton n4 = new JButton("4");
        n4.setFont(font);
        n4.addActionListener(new Listener());

        JButton n5 = new JButton("5");
        n5.setFont(font);
        n5.addActionListener(new Listener());

        JButton n6 = new JButton("6");
        n6.setFont(font);
        n6.addActionListener(new Listener());

        JButton minus = new JButton("-");
        minus.setFont(font);
        minus.addActionListener(new Listener());

        JButton n7 = new JButton("7");
        n7.setFont(font);
        n7.addActionListener(new Listener());

        JButton n8 = new JButton("8");
        n8.setFont(font);
        n8.addActionListener(new Listener());

        JButton n9 = new JButton("9");
        n9.setFont(font);
        n9.addActionListener(new Listener());

        JButton multiply = new JButton("*");
        multiply.setFont(font);
        multiply.addActionListener(new Listener());

        JButton c = new JButton("C");
        c.setFont(font);
        c.addActionListener(new Listener());

        JButton n0 = new JButton("0");
        n0.setFont(font);
        n0.addActionListener(new Listener());

        JButton equal = new JButton("=");
        equal.setFont(font);
        equal.addActionListener(new Listener());

        JButton divide = new JButton("/");
        divide.setFont(font);
        divide.addActionListener(new Listener());

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
    class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            String[] pars = source.toString().toLowerCase().split(",");
            String name = pars[25].replace("text=","");

            if(Character.isDigit(name.charAt(0))){
                if(x[1].equals("")){
                    if(!x[0].startsWith("0")){
                        x[0] += name;
                        field.setText(x[0] + " " + x[1] + " " + x[2]);
                    }
                }
                else{
                    if(!x[2].startsWith("0")){
                        x[2] += name;
                        field.setText(x[0] + " " + x[1] + " " + x[2]);
                    }
                }
            } else if(name.equals("c")){
                field.setText("");
                x = Arrays.stream(x).map(a -> a="").toArray(String[]::new);
            } else if(!x[0].equals("")){
                if((x[1].equals(""))&&(name.charAt(0) != '=')){
                    x[1] = name;
                    field.setText(x[0] + " " + x[1] + " " + x[2]);
                } else if((name.charAt(0) == '=')&&(!x[2].equals(""))){
                    switch (x[1]){
                        case "+":
                            field.setText(String.valueOf(Integer.parseInt(x[0]) + Integer.parseInt(x[2])));
                            break;
                        case "-":
                            field.setText(String.valueOf(Integer.parseInt(x[0]) - Integer.parseInt(x[2])));
                            break;
                        case "*":
                            field.setText(String.valueOf(Integer.parseInt(x[0]) * Integer.parseInt(x[2])));
                            break;
                        case "/":
                            try {
                                field.setText(String.valueOf(Integer.parseInt(x[0]) / Integer.parseInt(x[2])));
                            }
                            catch (ArithmeticException exception){
                                field.setText("Error! Division by zero");
                            }
                            break;
                    }
                    x = Arrays.stream(x).map(a -> a="").toArray(String[]::new);
                }
            }

        }
    }
}
