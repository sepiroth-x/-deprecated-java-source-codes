package com.sepirothx.salarytracker;

public class Salary {
    private float netSalary;
    private float lateDeduction;
    private float taxDeduction;
    private int hoursWorked;

    public Salary(float netSalary, float lateDeduction, float taxDeduction, int hoursWorked) {
        this.netSalary = netSalary;
        this.lateDeduction = lateDeduction;
        this.taxDeduction = taxDeduction;
        this.hoursWorked = hoursWorked;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public float getLateDeduction() {
        return lateDeduction;
    }

    public float getTaxDeduction() {
        return taxDeduction;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
