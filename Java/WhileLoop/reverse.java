import java.util.Scanner;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int rev = 0;

        // Keep running as long as num has digits left
        while (num > 0) {
            int lastDigit = num % 10;     // 1. Grab last digit
            rev = (rev * 10) + lastDigit; // 2. Glue it to rev
            num = num / 10;               // 3. Drop last digit
        }

        System.out.println("Reversed: " + rev);// if rev==num then num is palindrome
    }
} 
