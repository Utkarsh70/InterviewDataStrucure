
class Sol
{
    int divisibleBy4 (String N)
    {
        // Your Code Here
        int num=0;
        for(int i=0;i<N.length();i++){
            num=num*10+Integer.valueOf(N.charAt(i));
        }
        if(num%4==0)
          return 1;
        return 0;  
    }
}