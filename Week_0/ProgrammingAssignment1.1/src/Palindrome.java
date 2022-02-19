public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("tacocat"));

    }

    private static boolean isPalindrome(String inputString) {

        // if String = length of 1 or two, it is a palindrome
        if (inputString.length() == 0 || inputString.length() == 1) {
            return true;

            // check if first and last char
            // run isPalindrome on inString without first and last char
        } else if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1)) {
            return isPalindrome(inputString.substring(1, inputString.length() - 1));
        } else {
            // if first and last not equal
            return false;
        }
    }
}