package org.example.week2.ExerciseAndDownloads;// Program to calculate the average of student grades using a method
// The average is displayed with two decimal points: 83.67

public class CalculateGrades
{
  public static void main( String [] grades )
  {
    int [] studentGrades = { 79, 85, 92, 90, 76, 80 };
    System.out.println();
    System.out.printf( "The average grade is %.2f\n", calculateAverage( studentGrades ) );
  }
  
  public static double calculateAverage( int [] grades )
  {
    double sumOfGrades = 0;
    
    for( int i = 0; i < grades.length; i++ )
      sumOfGrades += grades[i];
    return sumOfGrades/grades.length;
  }
}