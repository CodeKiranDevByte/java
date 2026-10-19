public class BasicArray {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + arr[0]); // Output: 10
        System.out.println("Last element: " + arr[4]);  // Output: 50

        // Changing a value
        arr[2] = 99; // The value at index 2 (which was 30) is now 99
        System.out.println("New value at index 2: " + arr[2]);
    }
}