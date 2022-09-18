package com.sepirothx.heroofunknown;

public class CharacterClass implements CharClassSelection{
    private String name;
    private int defaultHp;
    private int defaultMana;
    private int numberOfSkills;

    public CharacterClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDefaultHp() {
        return defaultHp;
    }

    public int getDefaultMana() {
        return defaultMana;
    }

    public int getNumberOfSkills() {
        return numberOfSkills;
    }

    public void warriorClass(){
        this.defaultHp = 250;
        this.defaultMana = 100;
        this.numberOfSkills = 4;
    }

    public void rogueClass() {
        this.defaultHp = 150;
        this.defaultMana = 120;
        this.numberOfSkills = 4;

    }
    public void archerClass(){
        this.defaultHp = 150;
        this.defaultMana = 135;
        this.numberOfSkills = 4;
    }
    public void mageClass(){
        this.defaultHp = 150;
        this.defaultMana = 135;
        this.numberOfSkills = 4;

    }
}
