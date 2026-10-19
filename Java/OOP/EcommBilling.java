class Product{
    protected double price;

    Product(double np){
        this.price=np;
    }

    void calculateDiscount(){
        price=(price)-(price*5)/100;
        System.out.println("Standard 5 perc discount applied. Final price:" +price);
    
    }
}

class Electronics extends Product{

    Electronics(double price2){
        super(price2);

    }

    void calculateDiscount(){
        price=(price)-(price*10)/100;
        System.out.println("Standard 10 perc discount applied. Final price:" +price);
    
    }
}

class Clothing extends Product{

      Clothing (double price3){
        super(price3);

    }
    void calculateDiscount(){
        price=(price)-(price*20)/100;
        System.out.println("Standard 20 perc discount applied. Final price:" +price);
    
    }

}

public class EcommBilling{
    public static void main(String args[]){
        Product p1=new Product(5000);
        p1.calculateDiscount();
        
        Electronics e1=new Electronics(5000);
        e1.calculateDiscount();

        Clothing c1=new Clothing(5000);
        c1.calculateDiscount();
    }
}