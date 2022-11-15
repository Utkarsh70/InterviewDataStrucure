
class Solution{
    
  
    String roundToNearest(String N)
    {
        
        StringBuilder sb = new StringBuilder();
        int k = Character.getNumericValue(N.charAt(N.length()-1));
        if(k>5){
            int diff=10-k;
            int i=N.length()-1;
            int carry=0;
            int j=0;
            while(i>=0|| carry!=0 || j==0){
                int a= j==0?diff:0;
                int b= i>=0?Character.getNumericValue(N.charAt(i)):0;
                int sum=a+b+carry;
                carry=sum/10;
                sum=sum%10;
                sb.append(sum);
                i--;
                j--;
            }
            sb.reverse();
        }
        else if(k==0 || k<=5)
        {
            for(int l=0;l<N.length()-1;l++)
            {
                sb.append(N.charAt(l));
            }
            sb.append(0);
        }
        
        return sb.toString();
      
    }
}
