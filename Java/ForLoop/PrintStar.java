public class PrintStar {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
        
            for (int j = 1; j <= 3; j++) {
                System.out.print("* "); 
            }
            
            System.out.println(); 
        }


        
        for (int i = 1; i <= 3; i++) {
        
            for (int j = 1; j <= 4; j++) {
                System.out.print(i ); 
            }
            
            System.out.println(); 
        }

         for (int i = 1; i <= 3; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(i); 
            }
            
            System.out.println(); 
        }

         for (int i = 1; i <= 3; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            
            System.out.println(); 
        }

        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++);
            }
         System.out.println("");
        }

    }
}