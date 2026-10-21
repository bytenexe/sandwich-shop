package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Declare and initialize variables for the sammiches

        double regularPrice = 5.45;
        double largePrice = 8.95;
        int sizeRegular = 1;
        int sizeLarge = 2;

        // Ask user for their preferred sandwich size
        System.out.println("What size would you like? 1 for a Regular and 2 for a Large: ");
        String sizeChoiceString = myScanner.nextLine();
        int sizeChoice = Integer.parseInt(sizeChoiceString);

        // Ask user for their age
        System.out.println("How old are you?: ");
        String ageChoiceString = myScanner.nextLine();
        int ageChoice = Integer.parseInt(ageChoiceString);

        // Calculate discounts based on age
        int age = 0;

        if (age <= 17) {
            age =

    }
}