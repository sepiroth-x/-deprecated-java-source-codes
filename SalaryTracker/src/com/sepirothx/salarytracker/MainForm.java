package com.sepirothx.salarytracker;

import javax.swing.*;

public class MainForm extends JFrame{
    private JLabel labelFN;
    private JLabel labelSubject;
    private JLabel labelRate;
    private JLabel labelDisplayFN;
    private JLabel labelDisplaySubject;
    private JLabel labelDisplayRate;
    private JPanel mainPanel;

    public MainForm(){

        setContentPane(mainPanel);
        setTitle("Salary Tracker");
        setSize(450,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        String employeeName = "Richard";
        SalaryRate salaryRate = new SalaryRate(189);
        Subjects subject = new Subjects("Computer Programming",1,"8:00","12:00");
        Employee employee1 = new Employee(employeeName,24,salaryRate,subject);


        labelDisplayFN.setText(employeeName);
        labelDisplaySubject.setText(subject.getName());

        Float salaryRateToFloat = salaryRate.getSalaryPerHour(); //get the float data and store in a variable
        String salaryRateToString = salaryRateToFloat.toString(); // convert the float variable into string
        labelDisplayRate.setText(salaryRateToString); //call the String variable to display the data







    }

}
