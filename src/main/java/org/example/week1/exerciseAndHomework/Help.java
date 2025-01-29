package org.example.week1.exerciseAndHomework;

import java.util.Scanner;

public class Help
{
	public static void main( String [] args )
	{
	    Scanner input = new Scanner( System.in );
	    
	     // Prompt the user for input
	    System.out.println();
	    System.out.println("What would you like to get help with:");
	    System.out.println("  1. if statement");
	    System.out.println("  2. switch statement:");
		System.out.println("  3. for statement");
		System.out.println("  4. while statement:");
		System.out.println("  5. do-while statement");
		System.out.println("  0. quit this program");
	    System.out.print("Enter your choice (0-5): ");
	    int choice = input.nextInt();

	    // Display syntax for user selection
	    switch( choice )
	    {
		case 1:
			System.out.println("\nThe if: \n");
			System.out.println("if (condition) statement;");
			System.out.println("else statement;");
			break;
		case 2:
			System.out.println("\nThe switch: \n");
			System.out.println("switch (expression)");
			System.out.println("{");
			System.out.println("   case constant1:");
			System.out.println("      statement sequence");
			System.out.println("      break;");
			System.out.println("      ...");
			System.out.println("   case constantN:");
			System.out.println("      statement sequence");
			System.out.println("      break;");
			System.out.println("   default:");
			System.out.println("      statement sequence");
			System.out.println("}");
			break;
		case 3:
			System.out.println("\nThe for: \n");
			System.out.println("for (init; condition; iteration)");
			System.out.println("{");
			System.out.println("   statement sequence");
			System.out.println("}");
			break;
		case 4:
			System.out.println("\nThe while:\n");
			System.out.println("while (condition)");
			System.out.println("{");
			System.out.println("   statement sequence");
			System.out.println("}");
			break;
		case 5:
			System.out.println("\nThe do-while\n");
			System.out.println("do");
			System.out.println("{");
			System.out.println("   statement sequence");
			System.out.println("}");
			break;
		case 0:
			break;
		default:
			System.out.println("Selection is incorrect");
	    }
	}
}