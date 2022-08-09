package com.example.project;
/** OOP Lesson 1 - Source Code by: Sepiroth-x aka Richard C. Cupal,lpt
 * For Java Programming Course lesson discussion
 * Feel free to modify this source code
 * **/
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.setName("Cryptobot v.1");
        robot1.setType("Android");

        System.out.println("The name of the bot is: "+robot1.getName());
        System.out.println("Type of Robot: "+robot1.getType());



    }

}
