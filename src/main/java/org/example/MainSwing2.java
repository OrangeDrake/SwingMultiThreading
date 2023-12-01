package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.invokeLater;

public class MainSwing2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setLayout(new FlowLayout());
                frame.setBounds(400, 400, 400, 400);
                JButton btnClick = new  JButton("Klikni na me");
                JLabel label = new JLabel();
                frame.add(label);
                frame.add(btnClick);
                btnClick.addActionListener(new ActionListener() {
                    int counter = 0;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter++;
                        label.setText("Hello Swing: " + counter);
                    }
                });
                frame.setVisible(true);

            }
        });
    }
}