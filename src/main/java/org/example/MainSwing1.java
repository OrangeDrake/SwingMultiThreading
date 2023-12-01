package org.example;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.invokeLater;

public class MainSwing1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setBounds(400, 400, 400, 400);
                JButton btnClick = new  JButton("Klikni na me");
                frame.add(btnClick);
                btnClick.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello Swing");
                    }
                });
                frame.setVisible(true);
            }
        });
    }
}