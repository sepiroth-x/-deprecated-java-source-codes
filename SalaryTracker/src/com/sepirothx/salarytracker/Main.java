package com.sepirothx.salarytracker;

public class Main {

    public static void main(String[] args) {

        String employeeName = "Richard";
        SalaryRate salaryRate = new SalaryRate(189);
        Subjects subject = new Subjects("Computer Programming",1,"8:00","12:00");
        Employee employee1 = new Employee(employeeName,24,salaryRate,subject);

        System.out.println("Employee: "+ employee1.getName());
        System.out.println("Rate:" + salaryRate.getSalaryPerHour());
        System.out.println("Subject: " + subject.getName());


    }
}
