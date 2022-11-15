class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        // Your code here
        // int num1 = Integer.parseInt(num);
        // int result = num1%7;
        // return result;
       java.math.BigInteger num1 = new java.math.BigInteger(num);
       java.math.BigInteger modulus =num1.mod(new java.math.BigInteger("7"));
       int rem = modulus.intValue();
       
       return rem;
    }
}
