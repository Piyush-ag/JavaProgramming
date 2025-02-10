package org.example.week3.ExerciseAndDownloads;

public class CubeExerciseSolution
{
  public static void main( String [] args )
  {
    Cube cube1 = new Cube();     // Create a cube using default constructor
    cube1.setSide( 10 );         // Set side to 10
    
    displayCubeInfo( "Cube 1", cube1.getSide(), cube1.getVolume(), cube1.getSurfaceArea() );
    
    Cube cube2 = new Cube( 20 );  // Create a cube using parameterized constructor
    
    displayCubeInfo( "Cube 2", cube2.getSide(), cube2.getVolume(), cube2.getSurfaceArea() );
    
  }
  
  public static void displayCubeInfo( String name, int side, int vol, int area )
  {
    System.out.println();
    System.out.println( name + ":" );
    System.out.println( "        side = " + side );
    System.out.println( "        volume = " + vol );
    System.out.println( "        surface area = " + area );
  }
}