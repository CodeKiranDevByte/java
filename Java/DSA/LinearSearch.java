public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int foundAtIndex = -1; // -1 means "not found"

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundAtIndex = i;
                break; // Stop searching once found
            }
        }

        if (foundAtIndex != -1) {
            System.out.println("Found at index: " + foundAtIndex);
        } else {
            System.out.println("Not found in the array.");
        }
    }
}