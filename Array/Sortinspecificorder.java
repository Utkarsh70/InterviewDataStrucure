class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList<Long> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        
    }
}