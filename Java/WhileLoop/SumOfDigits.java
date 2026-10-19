import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int la=num%10;
            sum=sum+la;
            num=num/10; // Write the 3 steps here inside the loop
            
        }

        System.out.println("Sum of digits: " + sum);
    }
}