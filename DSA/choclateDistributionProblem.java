import java.util.*;

public class choclateDistributionProblem {

   public static void main(String []args) {

     int arr[]  = {12, 4, 7, 9, 2, 23,
                    25, 41, 30, 40, 28,
                    42, 30, 44, 48, 43,
                   50};
     int m = 7;
     int n = arr.length;
    
     Arrays.sort(arr);
     int min = Integer.MAX_VALUE;
     int d = 0;
     for(int i=0; i+m-1 < n ;i++) {
              d = arr[i+m-1] - arr[i];
               if(d<min)
                min = d;
    }
 System.out.println("minimum difference  :  " + d);
  }

}