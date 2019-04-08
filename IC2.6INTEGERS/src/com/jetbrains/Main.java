package com.jetbrains;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int integer1;
        integer1 = keyboard.nextInt();
        keyboard.skip("\n");
        System.out.print("Please give a number 1 through 10.");

        int integer2;
        integer2 = keyboard.nextInt();
        keyboard.skip("\n");
        System.out.print("Please give another number 1 through 10.");

        if (integer1 > integer2)
        {
            System.out.print(integer1 + " is greater than " + integer2);
        } else if (integer1 < integer2)
        {
            System.out.print(integer2);
        } else
        {
            System.out.println("They're equal!");
        }
    }

}
