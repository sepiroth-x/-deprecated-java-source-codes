package com.aow.project;

import java.util.Scanner;

/**
 * Source Code by: Sepiroth-x a.k.a Richard C. Cupal, LPT
 * for the purpose of discussing Object Oriented Programming
 * with Java Language
 * License: Creative Commons, feel free to modify the source code to your preference
 * **/

public class Player implements skillSets {
    String name;
    String schoolJoined;
    int numOfSkills = 0,
        brawn = 0,
        spirit = 0,
        dexterity = 0,
        stamina = 0;

    boolean fameOfJianghu = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolJoined() {
        return schoolJoined;
    }

    public void setSchoolJoined(String schoolJoined) {
        this.schoolJoined = schoolJoined;
    }

    public int getNumOfSkills() {
        return numOfSkills;
    }

    public void setNumOfSkills(int numOfSkills) {
        this.numOfSkills = numOfSkills;
    }

    public int getBrawn() {
        return brawn;
    }

    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public boolean isFameOfJianghu() {
        return fameOfJianghu;
    }

    public void setFameOfJianghu(boolean fameOfJianghu) {
        this.fameOfJianghu = fameOfJianghu;
    }

    public Player(){
        System.out.println("New Player Created!");


   }

    public void throwDart(){
        System.out.println("Throw dart in forward direction");
    }

}

