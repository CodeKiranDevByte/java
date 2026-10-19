import java.util.Scanner;

public class Fibonaci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term to find fibonacci series:");
        int term = sc.nextInt();

  
        int first = 0;
        int second = 1;

        System.out.print("Series: ");

        for (int i = 1; i <= term; i++) {
       
            System.out.print(first + " ");

          
            int nextTerm = first + second;

            first = second; 
            second = nextTerm;
        }
    }  
}