class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] ans =new String[2];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        int max=0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(max<entry.getValue()){
            ans[0]=entry.getKey();
            ans[1]=entry.getValue().toString();
            max=entry.getValue();
            }
            if(max==entry.getValue()){
                if(ans[0].compareTo(entry.getKey())>0){
                    ans[0]=entry.getKey();
                }
            }
        }
        
        return ans;
    }
}
