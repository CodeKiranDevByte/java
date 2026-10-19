public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 67, 34};
        int max = arr[0]; // Start by assuming the first element is the biggest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // New champion found!
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}