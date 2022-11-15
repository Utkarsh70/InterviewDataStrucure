import java.util.*;

public class quickSort {

     public static void quickSort(int arr[], int lb, int ub) {
           if(lb<ub) {
             loc = partition(arr,lb,ub);
             quickSort(arr,lb,loc-1);
             quickSort(arr,loc+1,ub);
           }
      }


   public static int partition(int arr[], int lb, int ub) {
          int pivot = arr[lb];
          start = lb;
          end = ub;
          while(start < end) {
              while(arr[start] <= pivot)
                    start++;
              while(arr[end] < pivot)
                    end--;
             if(start<end)
                 swap(arr[start], arr[end]);
           }
        return end;
     }

    public static void swap(start,end) {
          int temp;
          temp = end;
          end = start;
          start = temp;
     }


     public static void printArray(int arr[]) {
          for(int i=0;i<arr.length;i++) {
             System.out.println(arr[i]);
          }
      }


   public static void main(String []args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter array length : ");
     int n = sc.nextInt();
     int arr[] = new int[n];
     System.out.println("Enter array elements : ");
     for(int i=0;i<n;i++) {
          arr[i]  = sc.nextInt();
      }

        System.out.println("Sorted array is : ");
        selectionSort(arr,0,n-1);
        printArray(arr);
    }
}