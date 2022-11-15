class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count =0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(str.charAt(i) == '1' && str.charAt(j) == '1'){
                    count++;
                }
            }
        }
        return count;
    }
}