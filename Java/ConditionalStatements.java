public class ConditionalStatements {
    public static void main(String[] args) {
        

        // if statement ,executes a block of code only if a given condition is true.
        int i = 10;

        if (i < 15) {
            System.out.println("Condition is True");
        }

         
        // if-else statement,allows you to execute one block if the condition is true and another block if it is false.
        int j = 10;
        if (j < 15)
            System.out.println("j is smaller than 15");
        else
            System.out.println("j is greater than 15");


        //nested-if statement ,It is useful when a second condition depends on the first.
        int k = 10;
        // Outer if statement
        if (k < 15) {
            System.out.println("k is smaller than 15");

            // Nested if statement
            if (k == 10) {
                System.out.println("k is exactly 10");
            }
        }



        //  if-else-if ladder allows multiple independent conditions to be checked in order. 
        // As soon as one condition is true, its block executes, and the rest are skipped.
        int l = 20;
        if (l == 10)
            System.out.println("l is 10");
        else if (l == 15)
            System.out.println("l is 15");
        else if (l == 20)
            System.out.println("l is 20");
        else
            System.out.println("l is not present");



        // switch statement is a multiway branch statement.
        // It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 
        int num = 20;
        switch (num) {
        case 5:
            System.out.println("It is 5");
            break;
        case 10:
            System.out.println("It is 10");
            break;
        case 15:
            System.out.println("It is 15");
            break;
        case 20:
            System.out.println("It is 20");
            break;
        default:
            System.out.println("Not present");
        }

        
        
        //ternary operator in Java is a conditional operator that provides a shorthand way to write simple if-else statements
        int a = 10, b = 20;
        int max = (a > b) ? a : b;

        System.out.println("Maximum is " + max);
    }
}
