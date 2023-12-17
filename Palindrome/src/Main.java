import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String inputString = "level";


        if((isPalindrome(inputString))){
            System.out.println(inputString + "1.  is a palindrome.");
        } else {
            System.out.println(inputString + "2.  is not a palindrome.");
        }

        String inputString1 = "racecar";

        if (isCaseInsensitivePalindrome(inputString1)) {
            System.out.println(inputString + " is a case-insensitive palindrome.");
        } else {
            System.out.println(inputString + " is not a case-insensitive palindrome.");
        }

        String inputNum = "13141";

        if (isCaseInsensitivePalindrome(inputNum)) {
            System.out.println(inputString + " is a numeric palindrome.");
        } else {
            System.out.println(inputString + " is not a numeric palindrome.");
        }

        //==========================================================================
        int number = 12345;
        int reversedNumber = reverseInteger(number);

        System.out.println("5.  Original Number: " + number);
        System.out.println("6.  Reversed Number: " + reversedNumber);


        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("7.  Original String: " + originalString);
        System.out.println("8.  Reversed String: " + reversedString);

        //=========================================================================
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();

        String result = (numberToCheck % 2 == 0)? "even" : "odd";
        System.out.println(numberToCheck + "is" + result + ".");

        scanner.close();
    }

    private static boolean isPalindrome(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    private static boolean isCaseInsensitivePalindrome(String str){
        String cleanedStr = str.replaceAll("\\s","");
        return cleanedStr.equals((new StringBuilder(cleanedStr).reverse().toString()));
    }

    private static boolean isNumericPalindrome(int num){
        String numStr = String.valueOf(num);
        return  numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    private static int reverseInteger(int num){
        String reverseStr = new StringBuilder(String.valueOf(num)).reverse().toString();
        return  Integer.parseInt(reverseStr);
    }

    private static String reverseString(String str){
        return  new StringBuilder(str).reverse().toString();
    }
}