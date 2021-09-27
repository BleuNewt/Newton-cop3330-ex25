package org.example;
/*  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exersise25 {
    public static void printStrongNess(String input)
    {
        int a = input.length();
        boolean hasLetter = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLetter(i))
                hasLetter = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true; }

        System.out.print("The password '"+input);
        if (hasDigit && hasLetter && specialChar
                && (a >= 8))
            System.out.print("' is a Very Strong Password");
        else if (hasLetter && hasDigit
                && (a >= 8))
            System.out.print("' is a Strong Password ");
        else if (hasLetter && (a<8))
            System.out.print("' is a Weak Password");
        else if (hasDigit && (a<8))
            System.out.print("' is a Very Weak Password");
        else
            System.out.print("' is Undetermined");
    }
    public static void main(String[] args)
    {
        System.out.print("Enter password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        printStrongNess(password);
    }
}
