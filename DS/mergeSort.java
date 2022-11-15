import java.util.*;

public class mergeSort {   

     public static void mergeSort(int arr[]) {
            
      }

    public static void printArray(int arr[]) {
           for(int i=0;i<arr.length;i++)  {
              System.out.println(arr[i]);
           }
      }


     public static void main(String []args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter array length");
           int n = sc.nextInt();
           int arr[] = new int[n];
           for(int i=0;i<n;i++) {
              arr[i] = sc.nextInt();
           }
      mergeSort(arr);
      System.out.println("Sorted array : ");
      printArray(arr);
      }

 }