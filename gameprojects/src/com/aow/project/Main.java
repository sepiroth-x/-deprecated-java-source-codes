package com.aow.project;
/**
 * Source Code by: Sepiroth-x a.k.a Richard C. Cupal, LPT
 * for the purpose of discussing Object Oriented Programming
 * with Java Language
 * License: Creative Commons, feel free to modify the source code to your preference
 * **/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Player newPlayer = new Player();
        String playerName;
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        playerName = console.nextLine();
        newPlayer.setName(playerName);
        newPlayer.setNumOfSkills(0);
        newPlayer.setSchoolJoined("None");
        newPlayer.setBrawn(10);
        newPlayer.setDexterity(5);
        newPlayer.setSpirit(5);
        newPlayer.setStamina(8);


        System.out.println("Player name: " + newPlayer.getName());
        System.out.println("Skills Learned: " + newPlayer.getNumOfSkills());
        System.out.println("School: " + newPlayer.getSchoolJoined());
        System.out.println("Brawn: " + newPlayer.getBrawn());
        System.out.println("Dexterity: " + newPlayer.getDexterity());
        System.out.println("Spirit: " + newPlayer.getSpirit());
        System.out.println("Stamina: " + newPlayer.getStamina());





    }

}
