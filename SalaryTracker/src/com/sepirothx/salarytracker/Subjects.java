package com.sepirothx.salarytracker;

public class Subjects {
    private String name;
    private int subjectDuration;
    private String startTime;
    private String endTime;


    public Subjects(String name, int subjectDuration, String startTime, String endTime) {
        this.name = name;
        this.subjectDuration = subjectDuration;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public String getName() {
        return name;
    }

    public int getSubjectDuration() {
        return subjectDuration;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

}
