package com.uipractice.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    private JTextField tfFN;
    private JTextField tfLN;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel labelFN;
    private JLabel labelLN;
    private JLabel labelMsgBox;
    private JPanel mainPanel;

    public MainForm(){
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName, lastName;

                firstName = tfFN.getText();
                lastName = tfLN.getText();
                labelMsgBox.setText("Hello " + firstName + " " + lastName);

            }
        });


        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName, lastName;
                tfFN.setText("");
                tfLN.setText("");
                labelMsgBox.setText("Welcome");
            }
        });
    }

    public static void main(String[] args) {
        MainForm mainFrame = new MainForm();
    }

}
