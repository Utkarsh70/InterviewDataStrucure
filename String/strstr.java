class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code heres.
       for(int i=0;i<s.length();i++){
           for(int j = i+1; j<= s.length(); j++){
               if(x.equals(s.substring(i,j))){
                   return i;
               }
           }
       }
       return -1;
    }
}