class Solution 
{ 
    boolean kPangram(String str, int k) 
    {
        // code here
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++){
           if(Character.isAlphabetic(new Character(str.charAt(i)))){
               arr[str.charAt(i)-97]++;
           }
        }
        int zeros=0;
        int extras=0;
        for(int x:arr){
           if(x>1){
               extras+=x-1;
           }
           if(x==0){
               zeros++;
           }
        }
        if(zeros>k || extras<zeros){
           return false;
        }
       return true;
    }
}