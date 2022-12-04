class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long totalFine=0;
        if(date%2==0){
            for(int i=0;i<n;i++){
                if(car[i]%2==1){
                    totalFine+=fine[i];
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(car[i]%2==0){
                    totalFine+=fine[i];
                }
            }
        }
        return totalFine;
    }
}