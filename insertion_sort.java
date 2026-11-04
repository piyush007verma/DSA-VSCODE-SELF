import java.util.*;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}

// STABLE SORTING ALGO
// MAX PASSES = N-1
// MAX SWAPS = N(N-1)/2
// TIMCOMPLEXITY IS O(N) FOR BEST CASE (ARRAY NEARLY SORTED)  REST ALL CASE O(N^2);
// SPACE C = O(1) for all sorting algo
// BEST SORTING ALGO IS INSERTION SORT AND WORST IS SELECTION SORT 
// INSERION SORT IS BEST FOR NEARLY SORTED ARRAYS 