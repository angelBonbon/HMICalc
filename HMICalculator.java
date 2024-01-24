// Programmers: Bonita Rodrigues
// Course:  CS 212, Dr.Nweke
// Due Date: 1/25/24
// Lab Assignment: Lab2 HMI Calculator
// Problem Statement:  This program will calculate the user's HMI index and indicate the best calorie intake change.
// Input: height (ft), weight (lbs)
// Output: Outputs a statement with users hmi and whether they should increase, decrease, or maintain calorie intake
// Credits: none

import java.util.Scanner;
public class HMICalculator {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        // Opening statements
        System.out.println("This program will calculate the user's HMI index and indicate the best calorie intake change.");
        // Asks user for basic physical information
        System.out.println("What is your height (in feet)? ");
        double height = input.nextDouble();
        System.out.println("What is your weight (in pounds)? ");
        double weight = input.nextDouble();

        // Converts weight in lbs to kgs
        double kgWeight = weight / 2.2;
        // converts height in ft to m
        double mHeight = height / 3.28084;
        // hmi calculation to check weight index
        int hmi = (int)(kgWeight / Math.pow(mHeight, 2));

        // Outputs whether the user should increase, maintain, or decrease calorie intake according to hmi
        if (hmi < 18.5) { // lower hmi
            System.out.println("HMI of " + hmi + " needs calorie increase.");
        } else if ((18.5 <= hmi) && (hmi<= 25)) { // good hmi
            System.out.println("HMI of " + hmi + " should maintain current calorie intake.");
        } else { // higher hmi
            System.out.println("HMI of " + hmi + " needs calorie decrease.");
        }


    }
}
