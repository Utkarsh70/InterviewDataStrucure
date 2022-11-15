import java.util.*;

public class MaxAndMin {

 public static void MaxAndMin(int[] arr) {

      int min = arr[0];
      int max = arr[0];
      for(int i=1;i<arr.length;i++) {
           if(min > arr[i])
               min  = arr[i];
          if(max < arr[i])
               max = arr[i];
       }

System.out.println("Minimum : " + min);
System.out.println("Maximum : " + max);           
    }


  public static void main(String []args) {
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter array length");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter array elements : ");
      for(int i=0;i<n ;i++) {
         arr[i] = sc.nextInt();
      }
   
    MaxAndMin(arr);
  }
}