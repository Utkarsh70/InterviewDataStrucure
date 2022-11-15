class  Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        // add your code here
        if(sum > 9 * n){
            return "-1";
        }
        if(sum == 0){
            return "0";
        }
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            if(sum >=9){
                arr[i] = '9';
                sum-=9;
            }
            else{
                arr[i] = (char)(sum+'0');
                sum=0;
            }
        }
        String str ="";
        for(char c : arr){
            str+=c;
        }
        return str;
    }
}
