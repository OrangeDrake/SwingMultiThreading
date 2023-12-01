package org.example;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import static javax.swing.SwingUtilities.invokeLater;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setLayout(new FlowLayout());
                frame.setBounds(400, 400, 400, 400);
                JLabel label = new JLabel();
                //label.setBounds(200, 0,400,200);
                frame.add(label);
                JButton btnClick = new JButton("Klikni na me");
                frame.add(btnClick);
                btnClick.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello Swing");
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    TimeUnit.SECONDS.sleep(2);
                                    invokeLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            label.setText("2 seconds left");
                                        }
                                    });
                                } catch (InterruptedException ex) {
                                    throw new RuntimeException(ex);
                                }
                            }
                        };
                        thread.start();
                    }
                });
                frame.setVisible(true);
            }
        });
    }
}