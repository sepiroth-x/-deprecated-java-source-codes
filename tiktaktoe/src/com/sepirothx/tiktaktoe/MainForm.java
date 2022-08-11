package com.sepirothx.tiktaktoe;

import javax.swing.*;
import java.awt.*;


public class MainForm extends JFrame {

    private JPanel mainFrame;
    private JLabel labelA1;
    private JLabel labelA2;
    private JLabel labelA3;
    private JLabel labelB1;
    private JLabel labelB2;
    private JLabel labelB3;
    private JLabel labelC1;

    private JLabel labelC2;
    private JLabel labelC3;

    public MainForm(){

        setContentPane(mainFrame);
        setTitle("Tik Tak Toe");
        setSize(450,450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine(150,0,150,450);
        g.setColor(Color.BLUE);
        g.drawLine(300,0,300,450);
        g.setColor(Color.BLUE);
        g.drawLine(0,150,450,150);
        g.setColor(Color.BLUE);
        g.drawLine(0,300,450,300);


    }


    public static void main(String[] args) {

        MainForm mainForm = new MainForm();



    }
}


