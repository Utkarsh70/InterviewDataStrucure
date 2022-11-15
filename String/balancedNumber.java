class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<N.length()/2;i++){
            leftSum+=Integer.valueOf(N.charAt(i));
        }
        for(int i=N.length()/2 + 1;i<N.length();i++){
            rightSum+=Integer.valueOf(N.charAt(i));
        }
        if(leftSum == rightSum)
          return true;
        else
          return false;
    }
}

//Integer.valueOf() is used to get numeric value of a character