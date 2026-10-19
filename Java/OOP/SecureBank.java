class Customer{
    private String name;
    private long accountNumber;
    private double balance;

    Customer(String n1,long a1,double b1){
        this.name=n1;
        this.accountNumber=a1;
        this.balance=b1;
    }

    public String getName(){
        return name;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
        }
        else {
        System.out.println("amount is less than 0");
        }
        System.out.println("Balance after deposit="+balance);
    }
 
   void withdraw(double amount){
    if (amount>0 && balance>amount){
            balance=balance-amount;
        }
        else {
        System.out.println("amount is less than 0 or insufficient funds");
        }
         System.out.println("Balance after withdraw="+balance);
   }

}
public class SecureBank{
    public static void main(String args[]){
        Customer c1=new Customer("kiran",789065745,80000);
        c1.deposit(40000);
        c1.withdraw(30000);

    }
}