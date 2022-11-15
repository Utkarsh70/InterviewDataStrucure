import java.util.*;

public class mersgeSort {


    public static void mergeSort(int arr[], int lb, int ub) {
       if(lb<ub) {
         int mid = lb+(ub-1)/2;
         mergeSort(arr, lb, mid);
         mergeSort(arr, mid+1, ub);
         merge(arr, lb, mid, ub);
       }        
     }

     public static void merge(int arr[], int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
  
        
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[lb + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
  
        /* Merge the temp arrays */
        int i = 0, j = 0;
  
        int k = lb;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

     public static void printArray(int arr[]) {
         for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);
         }
     }

   public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
           arr[i] = sc.nextInt();
         }
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted Array");
        printArray(arr);
  }
}

