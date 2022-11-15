import java.util.*;

public class maximumSubArray {

  public static void findMaxSubArray(int []arr) {
          int size = arr.length;
          int max_so_far  = Integer.MIN_VALUE, max_ending_here = 0;

          for(int i=0;i<size;i++) {
             max_ending_here += arr[i];
             if(max_so_far < max_ending_here) 
                max_so_far = max_ending_here;
             if(max_ending_here < 0)
                max_ending_here = 0;
          }
           System.out.println("Maximum subarray sum : " + max_so_far);
  }

   public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter array length : ");
         int n = sc.nextInt();
          int []arr = new int[n];
          System.out.println("Enter array elements : ");
          for(int i=0;i<n;i++)
                 arr[i] = sc.nextInt();
          findMaxSubArray(arr);            
     }
}