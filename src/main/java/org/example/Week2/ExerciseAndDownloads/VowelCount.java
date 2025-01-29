package org.example.Week2.ExerciseAndDownloads;

public class VowelCount
{
  public static void main( String [] args )
  {
    String s = "A fool and his money are soon parted";
    int vowelCount = 0;
    
    s = s.toLowerCase();
    
    for( int i = 0; i < s.length(); i++ )
    {
      char c = s.charAt(i);
      
      if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
        vowelCount++;
    }
    
    System.out.println( "\nVowel Count = " + vowelCount );
  }
}
