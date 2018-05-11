/**
 * Created by MDavidovich on 7/23/16.
 */
import java.text.NumberFormat;
import java.util.*;

public class Davidovich_A04Q1 {

    // This program takes 5 string values, converts each to a double type
    // and takes the average of the 5 values.  If a user inputs an involid type
    // the error is caught and asks the user for a valid input.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;
        double sum = 0;
        double maxDoubles = 5.0;
        int numCount = 0;

        while (numCount < 5) {
            System.out.print("Please enter a number: ");
            input = scan.nextLine();
            System.out.println();
            try {                                                   // Try statement attempts to convert the string
                double convertString = Double.parseDouble(input);   // into a double.
                sum += convertString;
                numCount++;
            }
            catch (NumberFormatException exception) {               // The error catch displays a message asking for the
                System.out.print("Please enter a valid number.\n\n");   // user to enter a correct value.
            }
        }
        double average = sum / maxDoubles;
        System.out.println("The average is " + average);
    }
}


