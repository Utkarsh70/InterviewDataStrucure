import java.util.*;

public class insertionSort {

     public static void insertionSort(int arr[]) {
           int n= arr.length;
           for(int i = 1 ; i<n ;i++) {
             int temp = arr[i];
             int j = i-1;
             while(j >= 0 && arr[j] > temp) {
                  arr[j+1] = arr[j];
                  j--;
               }
             arr[j+1] = temp;
           }
       }



    public static void printArray(int arr[]) {
           for(int i=0; i< arr.length ; i++) {
               System.out.println(arr[i]);
          }
     }



   public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
        System.out.println("Sorted Array is : ");
        insertionSort(arr);
        printArray(arr);
   }

}