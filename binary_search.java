public class binary_search {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 16, 77, 79, 100 };
        int target = 100;
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2; // this is important because sometime SUM OF low and high goes OUT OF
                                              // INTEGER RANGE
            if (arr[mid] == target) {
                System.out.println("Target found at : " + mid);
                found = true;
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found == false) {
            System.out.println("Element not found!");
        }
    }
}