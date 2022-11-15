import java.util.*;

public class TwoSum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt(); 
     }
    int target = sc.nextInt();
    int[] result = findTwoSum(arr, target);
    System.out.print("result");
     for(int i=0;i<result.length;i++){
         System.out.print(result[i]);
       }
  }


    public static int[] findTwoSum(int[] arr, int target){
          HashMap<Integer, Integer> map = new HashMap<>();
          for(int i=0;i<arr.length;i++){
               int x = arr[i];
              if(map.containsKey(target-x)){
                    return new int[] {map.get(target-x)+1, i+1}; 
                 }
           map.put(x,i);
          }
          throw new IllegalArgumentException("No two Sum solution");   
     }
}