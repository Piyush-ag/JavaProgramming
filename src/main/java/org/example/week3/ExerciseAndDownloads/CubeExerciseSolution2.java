package org.example.week3.ExerciseAndDownloads;

public class CubeExerciseSolution2
{
  public static void main( String [] args )
  {
    Cube cube1 = new Cube();     // Create a cube using default constructor
    cube1.setSide( 10 );         // Set side to 10
    
    displayCubeInfo( "Cube 1", cube1 );
    
    Cube cube2 = new Cube( 20 );  // Create a cube using parameterized constructor
    
    displayCubeInfo( "Cube 2", cube2 );
    
  }
  
  public static void displayCubeInfo( String name, Cube c )
  {
    System.out.println();
    System.out.println( name + ":" );
    System.out.println( "        side = " + c.getSide() );
    System.out.println( "        volume = " + c.getVolume() );
    System.out.println( "        surface area = " + c.getSurfaceArea() );
  }
}