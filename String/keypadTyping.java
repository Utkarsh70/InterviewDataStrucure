class demo{

public static String printNumber(String s, int n) 
{
    //Your code here
    String result="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='a' && s.charAt(i) <='c')
          result+='2';
        else if(s.charAt(i)>='d' && s.charAt(i) <='f')
          result+='3';
        else if(s.charAt(i)>='g' && s.charAt(i) <='i')
          result+='4';
        else if(s.charAt(i)>='j' && s.charAt(i) <='l')
          result+='5';
        else if(s.charAt(i)>='m' && s.charAt(i) <='o')
          result+='6';
        else if(s.charAt(i)>='p' && s.charAt(i) <='s')
          result+='7';
        else if(s.charAt(i)>='t' && s.charAt(i) <='v')
          result+='8';
        else if(s.charAt(i)>='w' && s.charAt(i) <='z')
          result+='9';  
    }
    return result;
    
  }
}