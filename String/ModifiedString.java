class Solution
{
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    public static long modified(String a)
    {
        // Your code here
        long result=0;
        int count=1;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i) == a.charAt(i-1)){
                count++;
                if(count>=3){
                    result++;
                    count=1;
                }
            }
            else{
                count=1;
            }
        }
        return result;
    }
}