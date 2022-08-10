package com.sepirothx.game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JTextField tfGuess;
    private JLabel labelMessageBox;
    private JLabel labelInputIndicator;
    private JButton btnGuess;
    private JLabel labelAnswer;


    public MainFrame () {

        setContentPane(mainPanel);
        setTitle("Guessing Game");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        int answerNumber;
        Random randNumber = new Random();
        answerNumber = randNumber.nextInt(10);


        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean gameOver = false;
                do {
                    String guessNumber = tfGuess.getText();
                    int guessNumberToInt = Integer.parseInt(guessNumber);

                    if (guessNumberToInt == answerNumber) {
                        labelAnswer.setText("Correct Answer: " + answerNumber);
                        labelMessageBox.setText("You got the correct answer!");

                        gameOver = true;

                    } else {
                        labelMessageBox.setText("Wrong Guess!");
                        tfGuess.setText("");

                        if(guessNumberToInt > answerNumber){
                            labelMessageBox.setText("Guess lower! Try again!");
                        } else {
                            labelMessageBox.setText("Guess higher! Try again!");
                        }
                    }
                }while(!gameOver);


            }
        });
      }


    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

    }


}
