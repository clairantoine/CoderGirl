package com.jetbrains;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        boolean keepGoing = true;
        while (keepGoing)
        {
            System.out.println("Are we there yet?");
            Scanner keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine().toLowerCase();

            if (answer.equals("yes"))
            {
                keepGoing = false;
            } else if (!answer.equals("no"))
            {
                System.out.println("I don't understand.");
            }
        }
        System.out.println("YAY");
    }