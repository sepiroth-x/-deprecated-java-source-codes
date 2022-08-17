package com.sepirothx.project;

public class Main {

    public static void main(String[] args) {

        Dimension dimensions = new Dimension(20,20,5);
        Brand brandName = new Brand("Dell");
        Case theCase = new Case("220B",dimensions, brandName);

        Monitor theMonitor = new Monitor("Acer",new Resolution(1080,720));

        Motherboard theMotherboard = new Motherboard("ASUS FX80h200",4,2,"AMD A866");


        PersonalComputer myComputer = new PersonalComputer(theCase,theMonitor,theMotherboard);

        myComputer.getMonitor() .drawPixelAt(20,20,"RED");



    }
}
