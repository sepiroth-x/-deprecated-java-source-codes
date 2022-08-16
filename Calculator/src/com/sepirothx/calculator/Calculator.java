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
    private JButton jbtn0;

    int firstNumber, secondNumber;
    int result;
    char operatorSymbol;

    public Calculator(){

        setContentPane(calculatorPanel);
        setTitle("Calculator");
        setSize(250,240);
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

        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText(); //unsay data sa textfield ibutang niya sa variable
                tfResult.setText(resultString + jbtn2.getText());//ibutang ang btn text (2) sa text field

            }
        });

        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn3.getText());

            }
        });

        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn4.getText());

            }
        });

        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn5.getText());

            }
        });

        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn6.getText());

            }
        });

        jbtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn7.getText());

            }
        });

        jbtn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn8.getText());

            }
        });

        jbtn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn9.getText());

            }
        });


        jbtn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultString = tfResult.getText();
                tfResult.setText(resultString + jbtn0.getText());

            }
        });


        jbtnmultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textResult = tfResult.getText();
                firstNumber = Integer.parseInt(textResult);
                tfResult.setText(null);
                operatorSymbol = 'x';

            }
        });
        jbtnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textResult = tfResult.getText();
                secondNumber = Integer.parseInt(textResult);
                switch(operatorSymbol){
                    case 'x':
                        result = firstNumber * secondNumber;
                        tfResult.setText(Integer.toString(result));
                        break;
                    case '+':
                        result = firstNumber + secondNumber;
                        tfResult.setText(Integer.toString(result));
                        break;
                    case '/':
                        result = firstNumber / secondNumber;
                        tfResult.setText(Float.toString(result));
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        tfResult.setText(Integer.toString(result));
                        break;
                    default:
                        tfResult.setText("Syntax Error");
                        break;
                }
            }
        });
        jbtndivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textResult = tfResult.getText();
                firstNumber = Integer.parseInt(textResult);
                tfResult.setText(null);
                operatorSymbol = '/';

            }
        });


        jbtnaddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textResult = tfResult.getText();
                firstNumber = Integer.parseInt(textResult);
                tfResult.setText(null);
                operatorSymbol = '+';
            }
        });


        jbtnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textResult = tfResult.getText();
                firstNumber = Integer.parseInt(textResult);
                tfResult.setText(null);
                operatorSymbol = '-';

            }
        });
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();

    }


}
