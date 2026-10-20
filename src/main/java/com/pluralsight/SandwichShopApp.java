package com.pluralsight;
import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Ask user for their preferred sandwich size
        System.out.println("Select sandwich size:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter choice (1 or 2): ");
        int size = myScanner.nextInt();

        }
    }