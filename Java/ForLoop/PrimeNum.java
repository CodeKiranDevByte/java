import java.util.*;
public class PrimeNum {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("entre num to check prime or not:");
num=sc.nextInt();
int count=0;

for(int i=1;i<=num;i++){
    if(num%i==0)
    {
        count++;
    }

}
if(count==2){
    System.out.println("number is prime");
}
else{
    System.out.println("not prime");
}

    }
}
