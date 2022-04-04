package com.company;
import javax.swing.*;
import java.awt.event.*;

public class MyListener implements ActionListener {
JTextArea t3,t4;
MyListener(JTextArea text, JTextArea text2 ){
    this.t3=text;
    this.t4=text2;
        }
    @Override
    public void actionPerformed(ActionEvent e) {
this.t3.setText(this.t4.getText());
    }
}


