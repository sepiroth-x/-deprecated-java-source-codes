package com.sepirothx.project;

public class Monitor {
    private String brand;
    private Resolution resolution;

    public Monitor(String brand, Resolution resolution) {
        this.brand = brand;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){

        System.out.println("Drawing pixel at: " + x + "," + y + "in color: " + color);
    }

    public String getBrand() {
        return brand;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
