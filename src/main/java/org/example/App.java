package org.example;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String choiceQuote = new String("Please enter the temperature in ");
        char choice;
        int temp;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        choice = sc.next().charAt(0);

        switch (Character.toLowerCase(choice))
        {
            case 'c':
                System.out.println(choiceQuote + "Fahrenheit");
                temp = sc.nextInt();

                temp = (temp - 32) * 5 / 9;
                choiceQuote = "Celsius is " + temp;
                break;

            case 'f':
                System.out.println(choiceQuote + "Celsius");
                temp = sc.nextInt();

                temp = (temp * 9 / 5) * + 32;
                choiceQuote = "Fahrenheit is " + temp;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + Character.toLowerCase(choice));
        }


        System.out.println("The temperature in " + choiceQuote);
    }
}
