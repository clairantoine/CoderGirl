package com.jetbrains;
import java.util.Scanner;

/**Variables
 * weatherToday: sunny, cloudy, or rainy
 * moodToday: exercise, party, or quiet
 *
 */
public class Entertainment {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System out.print("What is the weather like today? ans. can be sunny, cloudy, or rainy).");
        String (weatherToday) = keyboard.nextLine();
         if(weatherToday = "sunny" && moodToday = "exercise");
             System.out.print("For exercise on a sunny day, try a brisk walk in a nature preserve.");
         if(weatherToday = "sunny" && moodToday = "party");
             System.out.print("For a fun party on a sunny day, look for a street festival.");
         if(weatherToday = "sunny" && moodToday = "quiet");
             System.out.print("A sunny day is a beautiful time to sit under a tree and read a book.");

        String (moodToday) = keyboard.nextLine();
        if(weatherToday = "cloudy" && moodToday = "exercise");
        System.out.print("For exercise on a sunny day, try a brisk walk in a nature preserve.");
        if(weatherToday = "cloudy" && moodToday = "party");
        System.out.print("For a fun party on a sunny day, look for a street festival.");
        if(weatherToday = "cloudy" && moodToday = "quiet");
        System.out.print("A sunny day is a beautiful time to sit under a tree and read a book.");

        if(weatherToday = "rainy" && moodToday = "exercise");
        System.out.print("For exercise on a sunny day, try a brisk walk in a nature preserve.");
        if(weatherToday = "rainy" && moodToday = "party");
        System.out.print("For a fun party on a sunny day, look for a street festival.");
        if(weatherToday = "rainy" && moodToday = "quiet");
        System.out.print("A sunny day is a beautiful time to sit under a tree and read a book.");


         if(weatherToday = !sunny||cloudy||rainy)
             System out.println("Error: Your weather answer wasn't one of the valid options.");
         if(moodToday = !"exercise"||"party"||"quiet")
             System out.println("Error: Your mood answer wasn't one of the valid options.");
    }
}

/** } else if(weather.toLOwerCase().equals ("rainy")) {
        if(mood.equals ("exercise")){
            System.out.println("Giand indoor trampolines..")
 } else if(mood.equals("party")){
            System.out.println("...")
 }
 }
 */

