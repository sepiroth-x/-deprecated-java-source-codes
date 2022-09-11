package com.sepirothx.basiccalculator;

import java.util.Scanner;
public class BasicCalculator {


    public static void main(String[] args) {
        System.out.println("CALCULATOR");
        System.out.println("Choose your operator");
        System.out.println("1-Addition \n2-Subtraction \n3-Multiplication\n4-Division ");
        Scanner inputNum = new Scanner(System.in);
        int selectNum = inputNum.nextInt();

        System.out.println("Enter first number:");
        int firstNum = inputNum.nextInt();

        System.out.println("Enter second number:");
        int secondNum = inputNum.nextInt();

        switch(selectNum){
            case 1:
                System.out.println("Sum is: "+(firstNum+secondNum));
                break;
            case 2:
                System.out.println("Difference is: "+(firstNum-secondNum));
                break;
            case 3:
                System.out.println("Product is: "+(firstNum*secondNum));
                break;
            case 4:
                System.out.println("Quotient is: "+((float)firstNum/secondNum));
                System.out.println("Remainder is: "+(firstNum%secondNum));
                break;
            default:
                System.out.println("Please select valid operator");
                break;

        }
    }

}
