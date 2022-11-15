import java.util.*;

public class selectionSort1{
   public static void selectionSort(int arr[]) {
       int n = arr.length;
      for(int i=0; i <n-1 ; i++ ) {
           int min = i;
           for(int j = i+1; j < n ; j++) {
               if(arr[j] < arr[min]) 
                   min = j;
            }
               //swap(arr[i],arr[min])
              int  temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp;      
         }
    }

  public static void printArray(int arr[]) {
      for(int i=0;i<arr.length;i++) {
         System.out.println(arr[i]);
       }
   }

   public static void main(String []args) {
     Scanner sc = new Scanner(System.in);
      
     System.out.println("Enter array length");
     int n = sc.nextInt();
     int arr[] = new int[n];
     System.out.println("Enter array elements");
     for(int i=0;i<n;i++) {
         arr[i] = sc.nextInt();
      }

   System.out.println("Sorted array is : ");
   selectionSort(arr);
   printArray(arr);
  }
}