public class ValidDemo
{

   public static void main(String[] args)
   {
      System.out.println("Got: " + GetValidInput.validateByte(Byte.MIN_VALUE, Byte.MAX_VALUE, "Enter a byte"));
      System.out.println("Got: " + GetValidInput.validateShort(Short.MIN_VALUE, Short.MAX_VALUE, "Enter a short"));
      System.out.println("Got: " + GetValidInput.validateInteger(Integer.MIN_VALUE, Integer.MAX_VALUE, "Enter an integer"));
      System.out.println("Got: " + GetValidInput.validateLong(Long.MIN_VALUE, Long.MAX_VALUE, "Enter a long"));
      System.out.println("Got: " + GetValidInput.validateFloat(Float.MIN_VALUE, Float.MAX_VALUE, "Enter a float"));
      System.out.println("Got: " + GetValidInput.validateDouble(Double.MIN_VALUE, Double.MAX_VALUE, "Enter a double"));
   }

} // end class