package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyWindow extends JFrame implements ActionListener {
    JFrame f;
    JTextArea textArea, textArea1;
    JButton t1, t2;


    private enum Actions {
        YES,
        NO
    }


    public class RandomNumber {
        public static int rnum() {
            int min = -100;
            int max = 100;
            int b = (int) (Math.random() * (max - min + 1) + min);
            return b;
        }
    }

    MyWindow() {
        f = new JFrame(" Are you dumb?");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(230, 110);
        f.setSize(710, 410);

        textArea = new JTextArea("      ARE YOU DUMB? ");
        textArea.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
        textArea.setBounds(270, 130, 150, 30);
        //textArea.setLayout(null);
        f.add(textArea);

        textArea1 = new JTextArea("            I KNEW");
        f.add(textArea1);

        t1 = new JButton();
        t1.setText("   YES");
        t1.setBounds(270, 170, 70, 30);
        t1.setActionCommand(Actions.YES.name());
        t1.addActionListener(this);
        f.add(t1);

        t2 = new JButton();
        t2.setText("   NO");
        t2.setBounds(350, 170, 70, 30);
        t2.setActionCommand(Actions.NO.name());
        t2.addActionListener(this);
        f.add(t2);


        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == Actions.YES.name()) {
            textArea.setText(this.textArea1.getText());
        }
        if (e.getActionCommand() == Actions.NO.name()) {
            t2.setBounds(t2.getX() + RandomNumber.rnum(), t2.getY() + RandomNumber.rnum(), t2.getWidth(), t2.getHeight());
        }
    }
}


