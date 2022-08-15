package com.sepirothx.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField tfResult;
    private JButton jbtn1;
    private JButton jbtnmultiply;
    private JButton jbtn3;
    private JButton jbtn2;
    private JButton jbtn4;
    private JButton jbtn5;
    private JButton jbtn6;
    private JButton jbtndivision;
    private JButton jbtn7;
    private JButton jbtn8;
    private JButton jbtn9;
    private JButton jbtnaddition;
    private JButton jbtnminus;
    private JButton jbtnequals;
    private JPanel calculatorPanel;

    int firstNumber, secondNumber;
    float result;

    public Calculator(){

        setContentPane(calculatorPanel);
        setTitle("Calculator");
        setSize(250,210);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO:
                String resultString = tfResult.getText(); //unsay data sa textfield ibutang niya sa variable
                tfResult.setText(resultString + jbtn1.getText());//ibutang ang btn text (1) sa text field



            }
        });
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();

    }


}
