package org.example.week3.ExerciseAndDownloads;// A class that models a cube

class Cube
{
 private int side;  // value for the side of a cube

 public Cube(int side) {
  this.side = side;
 }

 public Cube() {
 }
 public void setSide( int sideValue )
 {
  editSide( sideValue );
 }

 public int getVolume()
 {
  return side * side * side;
 }
 
 private void editSide( int value )
 {
  if ( value > 0 )
    side = value;
  else
    System.out.println( "\nERROR: Side values must be > 0" );
 }

 public int getSide() {
  return side;
 }

 public int getSurfaceArea() {
  return 6*side*side;
 }
}