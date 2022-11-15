import java.util.*;

public class quickSort {

     public static void quickSort(int arr[], int lb, int ub) {
           if(lb<ub) {
           int  loc = partition(arr,lb,ub);
             quickSort(arr,lb,loc-1);
             quickSort(arr,loc+1,ub);
           }
      }


   public static int partition(int arr[], int lb, int ub) {
          int pivot = arr[ub];
          int i = lb -1;
          for(int j = lb; j<=ub;j++) {
             if(arr[j] < pivot)
               {
                    i++;
                    swap(arr, i , j);
               }  
          }
  swap(arr, i+1, ub);
  return (i+1);
     }

    public static void swap(int arr[],int start, int end) {
          int temp;
          temp = arr[end];
          arr[end] = arr[start];
          arr[start] = temp;
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
        quickSort(arr,0,n-1);
        printArray(arr);
    }
}