package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Declare and initialize variables for the sammiches

        double regularPrice = 5.45;
        double largePrice = 8.95;
        double basePrice;

        // Ask user for their preferred sandwich size
        System.out.println("What size would you like? 1 for a Regular and 2 for a Large: ");
        String sizeChoiceString = myScanner.nextLine();
        int sizeChoice = Integer.parseInt(sizeChoiceString);

        // Ask user for their age
        System.out.println("How old are you?: ");
        String ageChoiceString = myScanner.nextLine();
        int age = Integer.parseInt(ageChoiceString);

        // Determine prices
        if (sizeChoice == 1)
            basePrice = regularPrice;
        else {
            basePrice = largePrice;
        }

        // Ask user if they want their sammich loaded? (what does that even mean)
        System.out.println("Do you want your sandwich loaded?: ");
        String loaded = myScanner.nextLine().toLowerCase();

        // Calculate loaded???????
        if (loaded.equals("y")) {
            if (sizeChoice == 1) {
                basePrice = basePrice + 1.00; // Add $1.00 for regular
            } else {
                basePrice = basePrice + 1.75; // Add $1.75 for Large
            }
        }

        // Calculate discounts based on age
        double discount;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = .20;
        } else {
            discount = 0.0; // Not 17 and younger or 65 and older
        }

        // Display the user's total cost for their (loaded????) sammich
        double totalCost = basePrice - (basePrice * discount);
        System.out.printf("Your total is: %.2f%n", totalCost);
    }
}