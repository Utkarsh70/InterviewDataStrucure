public class SearchInRoatedArray.java
 {

    public static int search(int []arr, int target) {
           int i=0;
           int j= arr.length-1;
           while(i<=j) {
             int mid = (i+j)  / 2;
             if(arr[mid] == target)
                 return mid;
             if(arr[i]<=arr[mid]) {
                   if(arr[i]  <= target && target < arr[mid])
                      j = mid-1;
                    else
                      i = mid+1;
             }else{
                   if(arr[mid]  < target && target <= arr[j])
                        i = mid+1;
                  else
                       j = mid-1;
                }
         }
      }
      public static void main(String []args) {
          int arr[] = new int[] {4,5,6,7,0,1,2};
          int target  = 1;
          System.out.println(search(arr, target)); 
       }
 }

//array is roatated sorted array