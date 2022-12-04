class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        int temp=0;
        if(k>n){
            k=k%n;
        }
        long ans[] = new long[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i];
        }
        int j=0;
        for(int i=k;i<n;i++){
            arr[j]=arr[i];
            j++;
        }
        int m=0;
        for(int i=j;i<n;i++){
            arr[i]=ans[m];
            m++;
        }       
    }
}