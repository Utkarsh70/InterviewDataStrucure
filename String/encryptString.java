class Solution {
    static String encryptString(String S){
        // code here
        String str="";
        for(int i=0;i<S.length();i++){
            long count=1;
            while(i+1 < S.length() && S.charAt(i) == S.charAt(i+1)){
                count++;
                i++;
            }
            str=Long.toHexString(count)+S.charAt(i)+str;
        }
        return str;
    }
};