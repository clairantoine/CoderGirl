package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("How many levels?");
        int userHeight = keyboard.nextInt();
        keyboard.skip("\n");
        System.out.print ("");
        int width= 2;

        for(int height= 1; height < userHeight; height++)
            {
                System.out.println("#");
                    for(int width= height+1 ; width< ; width++ )
                    {
                        System.out.print("#");
                    }

            }

        }
    }
}
