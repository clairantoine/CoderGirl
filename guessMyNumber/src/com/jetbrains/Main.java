package com.jetbrains;
import

public class Main {

    public static int main() {
        int number= 0;
        int hiddenNumber= 50;
        String answer;

        do
        {
            System.out.println ("I'm thinking of a number between 1 and 100. What is it?");

            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();
            keyboard.skip("\n");


            if number = hiddenNumber
            {
                System.out.println ("You got it! My number was " +hiddenNumber);
            }
            if number < hiddenNumber
            {
                System.out.println ("My number is higher.");
            }
            if number > hiddenNumber
            {
                System.out.println ("My number is lower.");
            }
	else
            {
                System.out.println ("Oops! That number isn't between 1 and 100. Try again.");
            }

        }
        while (number >1 || number < 100);
        System.outprintln("Do you want to play again?");
        answer = keyboard.nextchar;

        if (answer.toLowercase().equals("yes"))
        {
            hiddenNumber= (hiddenNumber// 2) + 3;
        }

    }

}
}
