class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long[] arr = new long[sum+1];
        arr[0]  = 1;
        for(int i=0;i<N;i++){
            for(int j=coins[i]; j < arr.length ;j++ ){
                arr[j]+=arr[j-coins[i]];
            }
        }
        return arr[sum];
    }
}