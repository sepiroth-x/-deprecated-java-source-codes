package com.sepirothx.project;

public class Case {

    private String name;
    private Dimension dimension;
    private Brand brandName;

    public Case(String name, Dimension dimension, Brand brandName) {
        this.name = name;
        this.dimension = dimension;
        this.brandName = brandName;
    }

    public void powerButton(){
        System.out.println("Power button pressed!");
    }

    public String getName() {
        return name;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Brand getBrandName() {
        return brandName;
    }
}
