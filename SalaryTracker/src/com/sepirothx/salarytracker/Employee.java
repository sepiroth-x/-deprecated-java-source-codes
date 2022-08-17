package com.sepirothx.salarytracker;

public class Employee {
    private String name;
    private int unitLoad;
    private SalaryRate salaryRate;
    private Subjects subject;

    public Employee(String name, int unitLoad, SalaryRate salaryRate, Subjects subject) {
        this.name = name;
        this.unitLoad = unitLoad;
        this.salaryRate = salaryRate;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getUnitLoad() {
        return unitLoad;
    }

    public SalaryRate getSalaryRate() {
        return salaryRate;
    }

    public Subjects getSubject() {
        return subject;
    }
}
