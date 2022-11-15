public class demo{
    public boolean checkForRotated(String s1, String s2){
      
     if(s1.length() != s2.length()) 
         return false;  
   
      String str = s1+s1;
      if(str.indexOf(s1)!=-1)
        return true;
     else
       return false;
   }
}