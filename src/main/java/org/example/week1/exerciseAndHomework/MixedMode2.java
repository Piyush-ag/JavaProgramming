package org.example.week1.exerciseAndHomework;// Program to test mixed mode conversions
//
// Program Output: x is 99999

public class MixedMode2
{
	public static void main( String [] args )
	{
		int x;
		double d = 99999.99;

		x = (int) d;	// OK - d is cast to int

		System.out.println("x is " + x);
	}
}
