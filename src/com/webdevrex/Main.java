package com.webdevrex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Get User Input
        Scanner userScan = new Scanner(System.in);
        System.out.println("Enter Value: ");
	    int userInput = userScan.nextInt();

//	    If divisible by 5 then print fizz
        if (userInput % 5 == 0){
            //      Check if also divisible by 3 then print fizzbuzz
            if (userInput % 3 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
            //      If divisible by 3 then print buzz
        } else if (userInput % 3 == 0){
            System.out.println("Buzz");
            //      If not print the number
        } else {
            System.out.println(userInput);
        }



    }
}
