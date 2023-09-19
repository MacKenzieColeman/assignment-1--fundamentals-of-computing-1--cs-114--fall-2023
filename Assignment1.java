// Import libraries here
// MacKenzie Coleman
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
   Scanner scan = new Scanner(System.in);

   //Print Initials

   System.out.println("MMMM           MMMM  CCCCCCCCCCCC");
   System.out.println("MMMMM         MMMMM  CCCCCCCCCCCC");
   System.out.println("MMMMMM       MMMMMM  CCC");
   System.out.println("MMM MMM     MMM MMM  CCC");
   System.out.println("MMM  MMMMMMMMM  MMM  CCC");
   System.out.println("MMM   MMMMMMM   MMM  CCC");
   System.out.println("MMM    MMMMM    MMM  CCCCCCCCCCCC");
   System.out.println("MMM             MMM  CCCCCCCCCCCC");

   //Fahrenheit to Celsius Converter

   System.out.print("Enter a temperature in Fahrenheit: ");
   double fahrenheit = scan.nextDouble();
   double celsius = (fahrenheit - 32) * 5.0 / 9.0;

   // 5 Character String, Trim Ends and Reverse

   System.out.print("Enter a 5 character string: ");
   String inputString = scan.next();
   if (inputString.length() == 5) {
     String trimmedString = inputString.substring(1, 4);
     StringBuilder reversedString = new StringBuilder(trimmedString).reverse();


     System.out.print("Results: " + celsius + reversedString);
   }
  }
}
