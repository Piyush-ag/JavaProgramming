package org.example.Week2.ExerciseAndDownloads;// Program to perform temperature conversions using methods

import java.util.Scanner;

public class TemperatureConversionsWithMethods
{
  public static float CelsiusToFahrenheit( float celTemp )
  {
    return 9F/5F * celTemp + 32F;
  }
  
  public static float FahrenheitToCelsius( float fahrTemp )
  {
    return 5F/9F * ( fahrTemp - 32F );
  }
  
  public static void main( String [] args )
  {
    int userSelection = 0;
    float celsiusTemp = 0;
    float fahrenheitTemp = 0;
    
    Scanner input = new Scanner( System.in );
    
    System.out.print( "Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: " );
    userSelection = input.nextInt();            // Get user input

    while( userSelection != 3 )
    {
      System.out.print( "Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: " );
      userSelection = input.nextInt();            // Get user input
      
      switch( userSelection )
      {
        case 1:     // Convert Fahrenheit to Celsius
                    System.out.print( "Enter a Fahrenheit temperature: " );
                    fahrenheitTemp = input.nextFloat();
                    celsiusTemp = FahrenheitToCelsius( fahrenheitTemp );
                    System.out.println( fahrenheitTemp + " degrees Fahrenheit = " + 
                                        celsiusTemp + " degrees Celsius" );
                    break;
        case 2:     // Convert Celsius to Fahrenheit
                    System.out.print( "Enter a Celsius temperature: " );
                    celsiusTemp = input.nextFloat();
                    fahrenheitTemp = CelsiusToFahrenheit( celsiusTemp );
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