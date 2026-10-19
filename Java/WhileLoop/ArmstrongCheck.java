import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int la = num % 10;
            sum = sum + (la * la * la); // Cubing the digit
            num = num / 10;
        }

        if (originalNum == sum) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}