// Import libraries here
// MacKenzie Coleman
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    try (
    Scanner scan = new Scanner(System.in)){;

    //Print Initials

    System.out.println(" MMMM           MMMM  CCCCCCCCCCCC" +
    "\n MMMMM         MMMMM  CCCCCCCCCCCC" +
    "\n MMMMMM       MMMMMM  CCC" +
    "\n MMM MMM     MMM MMM  CCC" +
    "\n MMM  MMMMMMMMM  MMM  CCC" +
    "\n MMM   MMMMMMM   MMM  CCC" +
    "\n MMM    MMMMM    MMM  CCCCCCCCCCCC" +
    "\n MMM             MMM  CCCCCCCCCCCC");

    //Fahrenheit to Celsius Converter

    System.out.print("Enter a temperature in Fahrenheit: ");
    double fahrenheit = scan.nextDouble();
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;

    //5 Character String, Trim Ends and Reverse

    System.out.print("Enter a 5 character string: ");
    String inputString = scan.next();
    if (inputString.length() == 5) {
      String trimmedString = inputString.substring(1, 4);
      StringBuilder reversedString = new StringBuilder(trimmedString).reverse();

    //Random Number Between 32 and 16,384

    Random random = new Random();
    int randomNumber = random.nextInt(16353) + 32;

    System.out.println("Results:" + celsius + reversedString + randomNumber);
    }
    //Invalid Response
    else {
    System.out.print("Invalid Input, Enter Valid Response\n");
  }
  }
}
}
