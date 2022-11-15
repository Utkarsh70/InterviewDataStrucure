class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
       int left=0,right=N-1;
       while(left<right){
           if(A[left]==1){
               if(A[right]==0){
                   swap(A,left,right);
               }else{
                   right--;
               }
            }else{
               left++;
            }
        }
    }
    static void swap(int A[], int left, int right){
        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}

