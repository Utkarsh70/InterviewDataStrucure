Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // your code here
       int max = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           int sum=0;
           arr[i].feet*=12;
           sum =sum+(arr[i].feet+arr[i].inches);
           max=Math.max(sum,max);
       }
       return max;
       
    }
    
}