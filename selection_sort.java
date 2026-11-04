import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minidx = -1;
            int minval = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                if (arr[j] < minval) {
                    minval = arr[j];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}

// SELECTION SORT IS UNSTABLE SORTING ALGO
// NO OF PASSES = N-1
// MAX NO OF SWAPS = N-1
// TIMECOMPLEXITY IS O(N^2) FOR ALL CASES
