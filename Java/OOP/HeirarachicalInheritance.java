class BankAccount {
    void checkBalance() { System.out.println("Checking balance..."); }
}

class SavingsAccount extends BankAccount {
    void addInterest() { System.out.println("Interest added."); }
}

class CurrentAccount extends BankAccount {
    void checkOverdraft() { System.out.println("Checking overdraft limit..."); }
}
public class HeirarachicalInheritance{
    public static void main(String args[]){
        CurrentAccount c1=new CurrentAccount();
        c1.checkOverdraft();
        c1.checkBalance();
       // this will give error because its sibling method of SavingsAccount c1.addInterest();


       SavingsAccount s1=new SavingsAccount();
       s1.addInterest();
       s1.checkBalance();
       // this will give error also due to sibling reason s1.checkOverdraft();
    }
}