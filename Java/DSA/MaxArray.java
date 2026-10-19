
public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34};
        
        // 1. Assume the first element is the max
        int max = arr[0];
        
        // 2. Iterate starting from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            // 3. If current element is bigger than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("The maximum element is: " + max);
    }
}