class Solution { 
    int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        int low=0, high=N-1;
        long totalSum=0, currSum=0;
        while(low<high){
            totalSum+=Arr[low]+Arr[high];
            int temp=Arr[low];
            Arr[low]=Arr[high];
            Arr[high]=temp;
            ++low;
            --high;
        }
        if(low==high){
            totalSum+=Arr[low];
        }
        int res=0;
        for(int i=0;i<N;i++){
            currSum+=Arr[i];
            if(currSum > totalSum - currSum){
                res=i+1;
                break;
            }
        }
        return res;
    }
}