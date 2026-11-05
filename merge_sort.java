public class merge_sort
{

    public static void merge(int[] a , int[] b , int[] arr)
    {
        int i = 0 , j = 0 , k = 0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[k] = a[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = b[j];
                j++;
                k++;
            }
                
        }

        if(i==a.length)  // if one array finishes other may contains leftover elements  
        {
            while(j<b.length)
            {
                arr[k++] = b[j++];
            }
        }
        if(j==b.length)
        {
            while(i<a.length)
            {
                arr[k++] = a[i++];
            }
        }
    }
    public static void mergesort(int[] arr)
    {
        int n = arr.length;
        if(n==1) return;
        int mid = n/2;
        int[] a = new int[mid];
        int[] b = new int[n-mid];  // splitting into 2 small arrays
        for(int i=0;i<mid;i++)
        {
            a[i] = arr[i];
        }
        for(int i=0;i<n-mid;i++)  // copy elements (MIND copying in second carefully)
        {
            b[i] = arr[i+mid]; 
        }

        mergesort(a); // recursive calls
        mergesort(b);
        

        merge(a , b , arr);  // merge using 3 pointers

        a = null;
        b = null; // to improve space complexity this will improve to O(n);
    }
    public static void main(String[] args) {
        int[] arr = {80,11,4,55,78,90,100};
        mergesort(arr);
        for(int ele : arr)
            {
                System.out.print(ele + " ");
            }    
    }
}

// timecomplexity  = O(NlogN)
// Spacecomplexity = O(N)


// Merge Sort is stable sort