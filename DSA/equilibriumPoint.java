class equilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        int leftSum =0;
        int rightSum =0;
        int pos = -1;
            
        for(int i=0;i<n;i++) {
            rightSum +=arr[i];
        }
        for(int i=0;i<n;i++) {
            rightSum -= arr[i];
            if(leftSum == rightSum){
                pos = i+1;
                break;
            }
            leftSum+=arr[i];
        }
        return pos;
    }
}