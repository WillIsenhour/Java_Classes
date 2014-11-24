import java.util.*;

public class GetValidInput
{

   // Interfaces for decimal variable types

   public static byte validateByte(byte minimum, byte maximum, String message) // Byte
   {  
      return (byte)(validateDecimal((long) minimum, (long) maximum, message));
   }
   
   public static short validateShort(short minimum, short maximum, String message)  // Short
   {  
      return (short)(validateDecimal((long) minimum, (long) maximum, message));
   }

   public static int validateInteger(int minimum, int maximum, String message) // Integer
   {  
      return (int)(validateDecimal((long) minimum, (long) maximum, message));
   }
      
   public static long validateLong(long minimum, long maximum, String message)  // Long
   {  
      return (long)(validateDecimal((long) minimum, (long) maximum, message));
   }

   // End decimal interfaces
   
   
   // Interfaces for floating point variable types
   
   public static float validateFloat(float minimum, float maximum, String message)  // Float
   {  
      return (float)(validateFloatingPoint((double) minimum, (double) maximum, message));
   }   
   
   public static double validateDouble(double minimum, double maximum, String message) // Double
   {  
      return (double)(validateFloatingPoint((double) minimum, (double) maximum, message));
   }   
   
   // End floating point interfaces  


   // Actual validation takes place below
   // -----------------------------------------------------------------------
   // Everything is passed down here as a either a long or a double since 
   // those primitives will contain any of the smaller primitives. 
   // These methods will never return anything out of the variable's range 
   // since the interface methods only accept minimum and maximum arguments
   // of the same data type as what the method is returning.
   

   private static long validateDecimal(long n, long x, String m) // Validation method for decimal numbers
   {   
      if (n > x) 
      {
         throw new IllegalArgumentException("The value provided for the 'maximum' argument in the GetValidInput method is smaller than the 'minimum' argument.");
      }
      
      // Anything past this point should be good input
      
      long r = 0; // return value;
      boolean valid = false; // set to true when input passes all tests     
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
      
      System.out.println();
      System.out.print(m + " > "); // prints the message passed in through argument

         if(!keyboard.hasNextLong() || !keyboard.hasNext()) // checks for garbage input
         {
            System.out.println("Invalid input");
            keyboard.nextLine();
         } 
         else 
         {
            r = keyboard.nextLong(); // feeds non-garbage input into actual validation
                       
            if(r >= n && r <= x) // checks valid input against range passed in through arguments
            {
               valid = true;
            } 
            else 
            {
               System.out.println("Your input must be greater than " + n + " and less than " + x + ".");
               keyboard.nextLine();
            } //end if
            
         } //end if
         
      }while(valid == false); // end do/while
      
      System.out.println("You entered " + r + ".");
      
      return r;
      
   } // end validateDecimal
   
   
   private static double validateFloatingPoint(double n, double x, String m) // Validation method for floating point numbers
   {   
      if (n > x) 
      {
         throw new IllegalArgumentException("The value provided for the 'maximum' argument in the GetValidInput method is smaller than the 'minimum' argument.");
      }
      
      // Anything past this point should be good input
      
      double r = 0; // return value;
      boolean valid = false; // set to true when input passes all tests     
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
      
      System.out.println();
      System.out.print(m + " > "); // prints the message passed in through argument

         if(!keyboard.hasNextDouble() || !keyboard.hasNext()) // checks for garbage input
         {
            System.out.println("Invalid input");
            keyboard.nextLine();
         } 
         else 
         {
            r = keyboard.nextDouble(); // feeds non-garbage input into actual validation
                                  
            if(r >= n && r <= x)  // checks valid input against range passed in through arguments
            {
               valid = true;
            } 
            else 
            {
               System.out.println("Your input must be greater than " + n + " and less than " + x + ".");
               keyboard.nextLine();
            } //end if
            
         } //end if
         
      }while(valid == false); // end do/while
      
      System.out.println("You entered " + r + ".");
      
      return r;
      
   } // end validateFloatingPoint   

} //end class