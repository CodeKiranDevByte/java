public class MinArray{
    public static void main(String args[]){
        int[] nums = {55, 12, 89, 7, 30};

        int min=nums[0];

        for(int i=1; i< nums.length;i++){
            if (nums[i]<min){
                min= nums[i];

            }
          
        }
          System.out.println("min="+min);
    }
}
 
