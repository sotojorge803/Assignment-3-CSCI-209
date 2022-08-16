/**
* A program that creates classes in order to manipulate strings.
* 
*@author Jorge Soto-Ventura
*/

public class StringUtilities {
    /**
    * Reverses the given string.
    * @param string hardcoded in 
    * @return whether the string is or is not a palindrome
    */
    public static void main( String args[] ) {
    String bose = "banana";
    System.out.println(StringUtilities.isPalindrome(bose));
    }

    /**
    * Reverses the given string.
    * @param string the String to reverse
    * @return the string backwards; e.g., "stars" --> "srats"
    */

    public static String reverseString(String string){
        //Using stringbuilder class in order to reverse the string
        StringBuilder Reverse = new StringBuilder(string).reverse();
        // Change stringbuilder to string so it can be returned properly.
        String newReverse = Reverse.toString();
        return newReverse;
    }   

    /**
    * Tests if a string is a palindrome.  A palindrome is a word
    * that is the same forwards and backwards (ignoring spaces and casing).
    * Some palindromes: 
    * "kayak"
    * "A man A plan A canal Panama"
    *
    * You should consider upper and lower case letters as the same.
    * 
    * However, you don't need to consider punctuation as special cases,
    * i.e., "A man. A plan. A canal. Panama." will return false.
    *
    * @param s the String to test if it's a palindrome
    * @return true iff the String is a palindrome
    * @see http://www.palindromelist.com
    */

    public static boolean isPalindrome(String string){
        // Create a string in order to test whether it will be equal.
        String palindrome = StringUtilities.reverseString(string);
        boolean test;
        // Use equalsIgnorecase in order to ignore upper and lowercase letters also use replaceall to ignore spacing.
        test = palindrome.replaceAll("\\s+","").equalsIgnoreCase(string.replaceAll("\\s+",""));
            return test;
    }
        




}    