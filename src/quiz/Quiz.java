package quiz;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Quiz extends JFrame {

    private  String[] question = new String[10];
    private String[] var1 = new String[10];
    private String[] var2 = new String[10];
    private String[] var3 = new String[10];
    private String[] var4 = new String[10];
    private  String[] right = new String[10];
    JLabel label;
    JTextField text;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    private int truth = 0;
    private int num = 0;
    JFrame frame;
    JPanel panel;

    public void run(String[] question, String[] var1, String[] var2, String[] var3,
                    String[] var4, String[] right){

        this.question = question;
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
        this.right = right;

        Font font = new Font(Font.DIALOG,Font.PLAIN,17);

        frame = new JFrame("Тест");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setPreferredSize(new Dimension(736,232));

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2,5,10));

        label = new JLabel("Вопрос 1/10");
        label.setHorizontalAlignment(SwingConstants.RIGHT);

        text =  new JTextField(question[num]);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFont(font);

        button1 = new JButton(var1[num]);
            button1.addActionListener(new Listener());
            button1.setFont(font);
        button2 = new JButton(var2[num]);
            button2.addActionListener(new Listener());
             button2.setFont(font);
        button3 = new JButton(var3[num]);
            button3.addActionListener(new Listener());
            button3.setFont(font);
        button4 = new JButton(var4[num]);
            button4.addActionListener(new Listener());
            button4.setFont(font);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.add(label, BorderLayout.NORTH);
        frame.add(text, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();
    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (num < 10){
                Object source = e.getSource();
                String[] pars = source.toString().toLowerCase().split(",");
                String name = pars[25].replace("text=","");
                if (name.equals(right[num].toLowerCase())) truth ++;
                if (num == 9) num = 10;
                if(num <= 8){
                    num++;
                    label.setText("Вопрос " + (num+1) + "/10");
                    text.setText(question[num]);
                    button1.setText(var1[num]);
                    button2.setText(var2[num]);
                    button3.setText(var3[num]);
                    button4.setText(var4[num]);
                }
            }
            if(num == 10){
                frame.remove(label);
                frame.remove(panel);

                text.setText("Ваш результат: " + truth + " из 10");
                text.setFont(new Font(Font.DIALOG,Font.PLAIN,30));
                frame.setPreferredSize(new Dimension(500,300));

                frame.pack();
            }
        }
    }
}
