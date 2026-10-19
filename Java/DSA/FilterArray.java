public class FilterArray {
    public static void main(String[] args) {
        int[] arr = {11, 20, 33, 40, 55};
        
        for (int i = 0; i < arr.length; i++) {
            // Check if the number is divisible by 2
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is an even number.");
            }
        }
    }
}