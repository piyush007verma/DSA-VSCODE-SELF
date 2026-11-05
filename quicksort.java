public class quicksort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int smallcount = 0;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot) {
                smallcount++;
            }
        }

        int correctindex = low + smallcount;
        swap(arr, low, correctindex);

        // partition
        int i = low;
        int j = high;
        while (i < correctindex && j > correctindex) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctindex;
    }

    public static void quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int idx = partition(arr, low, high);
        quick(arr, low, idx - 1);
        quick(arr, idx + 1, high);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 8, 2, 9, 7, 2, 3 };
        quick(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}


// Quick Sort is Unstable While Merge sort is stable 

// Time complexity in best case and Average case is : O(NlogN)
// Time Complexity in worst case is : O(N^2);
// Space Complexity in BestCase and AverageCase is : O(log n)

// Space Complexity In worst Case is : O(n);