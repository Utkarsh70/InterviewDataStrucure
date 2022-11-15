
class Sol
{
    int getCount (String s, int N)
    {
        // your code here
        int[] arr = new int[26];
        char prev = '#';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prev != c) {
                arr[c - 'a']++;
            }
            prev = c;
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                count++;
            }
        }
        return count;
    }
}