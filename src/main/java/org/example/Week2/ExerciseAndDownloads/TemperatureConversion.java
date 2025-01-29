package org.example.Week2.ExerciseAndDownloads;// The following program prompts a user to enter temperatures in degrees Fahrenheit or Celsius.
// It then converts the entered temperature to the other measurement scale and displays both the 
// entered temperature and the equivalent temperature in the other measurement scale.

import java.util.Scanner;

public class TemperatureConversion
{
  public static void main( String [] args )
  {
    int userSelection = 0;                        // User selection 1, 2, 3
    float fahrenheitTemp = 0;                     // Fahrenheit temperature
    float celsiusTemp = 0;                        // Celsius temperature
    
    Scanner input = new Scanner( System.in );     // Create a Scanner for input
    
    while( userSelection != 3 )
    {
      System.out.println();
      System.out.print( "Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: " );
      userSelection = input.nextInt();            // Get user input
      
      switch( userSelection )
      {
        case 1:     // Convert Fahrenheit to Celsius
                    System.out.print( "Enter a Fahrenheit temperature: " );
                    fahrenheitTemp = input.nextFloat();
                    celsiusTemp = 5F/9F * (fahrenheitTemp - 32F);
                    System.out.println( fahrenheitTemp + " degrees Fahrenheit = " + 
                                        celsiusTemp + " degrees Celsius" );
                    break;
        case 2:     // Convert Celsius to Fahrenheit
                    System.out.print( "Enter a Celsius temperature: " );
                    celsiusTemp = input.nextFloat();
                    fahrenheitTemp = 9F/5F * celsiusTemp + 32F;
                    System.out.println( celsiusTemp + " degrees Celsius = " +
                                        fahrenheitTemp + " degrees Fahrenheit" );
                    break;
        case 3:     // Quit program
                    System.out.println( "Goodbye" );
                    break;
        default:    // Invalid user selection
                    System.out.println( "INVALID CHOICE: You must enter 1, 2, or 3" );
      }
    }
  }

}


