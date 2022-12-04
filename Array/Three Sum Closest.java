class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        int diff = Integer.MAX_VALUE;
        int result=0;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            int n = i+1;
            int m =array.length-1;
            while(n<m){
                int a = array[n];
                int b = array[m];
                int sum = array[i]+a+b;
                if(target==sum){
                    return sum;
                }else if(sum< target){
                    if(Math.abs(target-sum)<diff){
                        result = sum;
                        diff=Math.abs(target-sum);
                    }
                    n++;
                }else{
                    if(Math.abs(target-sum)<=diff){
                        result = sum;
                        diff=Math.abs(target-sum);
                    }
                    m--;
                }
                
            }
        }
        return result;
	} 
} 
