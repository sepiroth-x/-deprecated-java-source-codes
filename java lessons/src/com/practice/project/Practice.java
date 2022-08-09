package com.practice.project;
/** Guessing Game Source Code by: Sepiroth-x aka Richard C. Cupal,lpt
 * For Java Programming Course lesson discussion
 * Feel free to modify this source code
 * **/

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        boolean gameOver = false;
        int var1, counter = 0;


        Random rand = new Random();
        int answer = rand.nextInt(10);

        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Please enter a number of your guess 1~10");
            var1 = console.nextInt();
            counter++;

            if (var1==answer){
                System.out.println("You got the correct answer! Game Over!");
                System.out.println("Attempts: " + counter);
                gameOver = true;
            }
            else {
                if(var1>answer){

                System.out.println("Guess lower! Try again!");
                } else {
                    System.out.println("Guess higher! Try again!");
                }

            }

        } while(!gameOver);

    }

}
