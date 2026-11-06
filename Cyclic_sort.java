public class Cyclic_sort
{
    public static void swap(int[]arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 0, 3, 5, 2};
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            if(arr[i]==i) i++;
            else swap(arr , i , arr[i]);
        }

        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}

// Cycle Sort is Used When given array of length n and it contains element o to n or o to n-1  or 1-n, and we have to find missing no , duplicate no etc
// Numbers cant repeat They should be unique 
// Note when elements are from 1 to n we have to check arr[i]==i+1 then i++ and swap(arr , i , arr[i]-1);
// Time complexity OF cyclic sort is O(N) in all the cases
// Space Complexity is O(1); in all cases Auxillary space

// Max no of Swaps can be N-1