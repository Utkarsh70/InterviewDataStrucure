class Solution{
    String modify(String S){
        if(S.charAt(0)>='a' && S.charAt(0) <= 'z'){
            return S.toLowerCase();
        }
        else
           return S.toUpperCase();
    }
}