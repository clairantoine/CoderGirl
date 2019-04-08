package com.jetbrains;

/*
this program takes the high temperatures for two weeks (7 days each)
and provides the average high temperature for each week.
Also should return the warmest day from each week.

float average1= average of all temps, week 1;
float average2= average of all temps, week 2;
int sum1= sum of all temps, week 1;
int sum2= sum of all temps, week 2;
*/

public class Main
{

    public static int week1Average(int average1)
    {
        int highTemps1[] = {53, 55, 54, 58, 63, 63, 65};
        System.out.println("Week 1 High Temperatures\n" + highTemps1);

        for (int index = 0; index < highTemps1.length; index++)
        {
            sum1 = highTemps1[index];
        }
        float average1 = sum1 / (float) highTemps1.length;

    } return average1


    public static int week1Results(String, int sum1)
    {
        System.out.println("The average daily-high temperature for week 1 is" + average1);
    }

}

    public static void main(String[] args) {

        int highTemps2 [] = {32, 29, 45, 55, 60, 65, 65};
        System.out.println("Week 2 High Temperatures\n" + highTemps2);

        System.out.println("The average daily-high temperature for week 2 is" + average2);
    }

}
