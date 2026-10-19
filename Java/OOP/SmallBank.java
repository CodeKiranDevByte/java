interface PaymentMethod{
    abstract void pay(double amount);
}

abstract class BankCard implements PaymentMethod{
private String cardNumber;

BankCard(String c1){
    this.cardNumber=c1;
}

void showCardDetails(){
    System.out.println("Paying with card ending in "+cardNumber);
}

}
class CreditCard extends BankCard{
 
     CreditCard(String c2){
        super(c2);

     }

    public void pay(double amount){
        showCardDetails();
        System.out.println("Processing Credit Card payment of Rs." +amount+" with a 2% fee.");

    }

}
class UPI  implements PaymentMethod{

    private String upiId; 

    UPI(String upiId) {
        this.upiId = upiId;
    }
public void pay(double amount){
    
        System.out.println("Processing UPI payment of Rs. "+amount+"directly from bank.");

    }
}
public class SmallBank{
    public static void main(String args[]){
        CreditCard c1=new CreditCard("MAHB8090");
        c1.pay(500);

        UPI u1=new UPI("Kiran@okaxis");
        u1.pay(1000);
    }
}