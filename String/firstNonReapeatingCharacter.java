class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char ch = '$';
        for(int i=0;i<S.length();i++){
            int count=1;
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
               ch = S.charAt(i);
               break;
            }
        }
        return ch;
    }
}