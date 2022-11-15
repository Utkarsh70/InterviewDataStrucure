import java.util.*;

public class RomanToInt{
  public static void main(String []args){

   }

   public int romanToInt(String str){
        Map<Character, Integer> map = new HashMap<>(){{
             put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
         }};

       int sum=0,n=str.length();
       for(int i=0;i<n;i++){
           if(i!n-1 && map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                  sum+=map.get(str.charAt(i+1)) - map.get(str.charAt(i));
                  i++;
              }
            else{
                    sum+=map.get(str.charAt(i));
              }
        }
           return sum;
    }

}