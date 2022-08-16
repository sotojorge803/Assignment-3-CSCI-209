import java.util.Scanner;

/**
 * Prompts user for a phrase and determines if the given phrase is a
 * palindrome.
 * 
 * @author Jorge Soto-Ventura
 */

import java.util.Scanner;

public class Driver {


    public static void main( String args[] ) {
        // Create scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.println("This program determines if a word or phrase is a palindrome.");
        System.out.print("What is the potential palindrome? ");
	    String palindrome = sc.nextLine();
        sc.close();
        // use if statment to print out true or false based on whether the string was or was not a palindrome.
        if (StringUtilities.isPalindrome(palindrome)) {
            // prints if it is a palindrome.
            System.out.println(palindrome + " is a palindrome.");
        }
        else {
            // prints if it is not a palindrome.
            System.out.println(palindrome + " is not a palindrome.");

        }
        

    }


}
