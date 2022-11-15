import java.util.*;

public class rotateArray{

    public static void rotateArray(int[] arr, int d, int n)
     {
        int i;
        for(i = 0 ; i < d ; i++){
             rotateArrayOneByOne(arr,n);
         }
     }

    public static void  rotateArrayOneByOne(int []arr , int n) {
          int temp = arr[0];
          for(int i=0; i < n-1 ; i++)
           {
              arr[i] = arr[i+1];
           }
     arr[n-1] = temp;
     }

    public static void printArray(int []arr)
    {
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i] + " ");
       }
    }

   public static void main(String[] args)
     {
         int arr[] = new int[7];
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter array elements");
         for(int i=0; i<arr.length;i++)
          {
              arr[i] = sc.nextInt();
          }
          System.out.println("Enter number of place to rorate : ");
          int d = sc.nextInt();
          rotateArray(arr, d, arr.length);
          System.out.println("Rotated Array : ");
          printArray(arr);
     }
}
