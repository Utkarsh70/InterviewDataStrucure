class Solution {
    static int isGoodorBad(String S) {
        // code here
        int max1=0,max2=0,countv=0,countc=0;
        for(int i=0;i<S.length();i++){
            if(check(S.charAt(i))){
                countv++;
                countc=0;
                max1 = Math.max(countv, max1);
            }else{
                countv=0;
                countc++;
                max2 = Math.max(countc, max2);
            }
        }
        if(max2 > 3 || max1 > 5){
            return 0;
        }
        return 1;
    }
    static boolean check(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }else 
           return false;
    }
};