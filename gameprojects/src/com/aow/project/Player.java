package com.aow.project;
/**
 * Source Code by: Sepiroth-x a.k.a Richard C. Cupal, LPT
 * for the purpose of discussing Object Oriented Programming
 * with Java Language
 * License: Creative Commons, feel free to modify the source code to your preference
 * **/

public class Player extends MainSchools{
    String name;
    String schoolJoined;

    int numOfSkills = 0;
    int brawn = 0;
    int spirit = 0;
    int dexterity = 0;

    int stamina = 0;

    boolean fameOfJianghu = false;

    public void setName (String name){
        this.name = name;
    }

    public void setSchoolJoined(String schoolJoined){
        this.schoolJoined = schoolJoined;
    }

    public void setNumOfSkills (int numOfSkills) {
        this.numOfSkills = numOfSkills;
    }
    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setFameOfJianghu(boolean fameOfJianghu) {
        this.fameOfJianghu = false;
    }
    public String getName() {
        return name;
    }

    public String getSchoolJoined() {
        return schoolJoined;
    }

    public int getNumOfSkills() {
        return numOfSkills;
    }

    public int getBrawn() {
        return brawn;
    }

    public int getSpirit() {
        return spirit;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public boolean isFameOfJianghu() {
        return fameOfJianghu;
    }

}

