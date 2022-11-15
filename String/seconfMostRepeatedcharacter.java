class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        TreeMap<Integer, String> map1 = new TreeMap<>();
        for(String str : map.keySet()){
            String val = str;
            int key = map.get(str);
            map1.put(key,val);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String str : map1.values()){
            list.add(str);
        }
        return list.get(list.size()-2);
        
    }
}