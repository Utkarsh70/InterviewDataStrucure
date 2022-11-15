class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n = nums.length;
        int [][]pair = new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair,(a,b) -> a[0]-b[0]);
        int swaps=0,i=0;
        
        while(i<n){
            int index = pair[i][1];

            if (i != index) {
                swaps++;
                swap(pair, index, i); 
            } else {
                i++;
            }
        }
        return swaps;
    }
    public void swap(int[][] arr, int i,int j){
        int value = arr[i][0];
        int index = arr[i][1];
        arr[i][0]  = arr[j][0];
        arr[i][1] = arr[j][1];
        arr[j][0] = value;
        arr[j][1] = index;
    }
}