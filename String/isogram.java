class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        boolean flag = true;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        for(char c : data.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,i++);
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}