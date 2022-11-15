class solution{

   public static void main(String[] args){
         
    }
public static boolean isRotated(String str1, String str2)
          {
              String left = str1.substring(2) + str1.substring(0,2);
              String right = str1.substring(str1.length() -2) + str1.substring(0, str1.length()-2);
              if(left.equals(str2))
                 return true;
             else if(right.equals(str2))
                 return true;
             return false;
          }
}