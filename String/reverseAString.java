class Solution {
    
    public String reverse(String S){
        //code here
        ArrayList<Character> list = new ArrayList<>();
        for(int i=S.length()-1;i>=0;i--){
            list.add(S.charAt(i));
        }
        String str ="";
        for(char ch : list){
            str +=ch;
        }
        return str;
    }

}