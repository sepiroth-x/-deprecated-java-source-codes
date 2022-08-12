package com.codingpractice.project;

public class Main {

    public static void main(String[] args) {

        int[] varArr = {1,3,6,5,0,3};
        solution(varArr);

        }


    static int solution(int[] inputArray) {

        //solution:
        //multiply index 0 and 1, 2 and 3, 4 and 5.
        int arrLength = inputArray.length;
        int productDivision = arrLength / 2;
        int[] productArray = new int[productDivision];
        int counter = 0;

        for(int i = 0; i < arrLength; i++){
            System.out.println("Index "+ i + ":" + inputArray[i]);
            productArray[i] = inputArray[i];
            counter++;

           for(int x = i; counter % 2 == 0 ; x++) {

                   productArray[i] = (inputArray[i] - 2) * (inputArray[counter] - 3);
                   System.out.println("Products of: " + (inputArray[i] - 2) + " & " + (inputArray[counter] - 3) + " is " + productArray[i]);
                   counter++;

                   //TODO: Fix the loop cycle ....
           }


        }

        System.out.println("Loops: " + counter);
        return 0;

    }



}
