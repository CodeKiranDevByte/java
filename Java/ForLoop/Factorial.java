import java.util.*;
public class Factorial {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num;
    int fact=1;
    System.out.println("entre num to find fcatorial");
    num=sc.nextInt();
    for(int i=1;i<=num;i++){
       fact=fact*i;
    }
    System.out.println(fact);
    }
}
