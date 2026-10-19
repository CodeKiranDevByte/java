import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();

        int rev = 0; // Storage for reversed number

        for (; num > 0; num = num / 10) {
            int rem = num % 10;      // 1. Extract last digit
            rev = (rev * 10) + rem;  // 2. Add it to reversed number
        }

        System.out.println("Reversed number: " + rev);
    }
}