public class TwoPointerPair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9}; // Must be sorted!
        int target = 10;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Found pair: " + arr[left] + " + " + arr[right]);
                break;
            } else if (sum < target) {
                left++; // Increase sum
            } else {
                right--; // Decrease sum
            }
        }
    }
}