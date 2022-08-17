package com.sepirothx.project;

public class Motherboard {
    private String name;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String name, int ramSlots, int cardSlots, String bios) {
        this.name = name;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getName() {
        return name;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
