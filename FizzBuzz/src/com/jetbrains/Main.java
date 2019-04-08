package com.jetbrains;

public class Main {

    public static void main(String[] args)
    {
        int x = 1;
        while (x < 101)
        {
            if (x % 3 == 0)
            {
                System.out.println("Fizz");
            }
            if (x % 5 == 0)
            {
                System.out.println("Buzz");
            }

            else
            System.out.println(x);
            x++;
        }
    }

}
