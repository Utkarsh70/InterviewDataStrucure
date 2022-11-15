import java.util.*;

public class containsDuplicate {

   public static void checkDuplicate(int []arr)  {
       int count = 0;
       for(int i=0;i<arr.length;i++) {
         for(int j=i+1;j< arr.length;j++) {
             if(arr[i] == arr[j])
                count++;
        }
      }
    if(count > 0)
     System.out.println("Present " + count + " duplicates");
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
      System.out.println("Enter array elements : ");
       for(int i=0;i<n;i++) 
         arr[i] = sc.nextInt();
      
       checkDuplicate(arr);
    }
}