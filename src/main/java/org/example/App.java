package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double euros, exchangeRate;
        System.out.print("How many euros are you exchanging? ");
        euros = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        exchangeRate = sc.nextDouble();
        double endValue = (int) (.5 + ((exchangeRate * euros) * 100));
        endValue /= 100;
        System.out.printf("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars.", euros, exchangeRate, endValue);
    }
}
