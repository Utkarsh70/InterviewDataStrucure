class Solution {
    static final int MAX_CHAR = 26;
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int n = s1.length();
        if (s2.length() != n)
            return false;
 
        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int count = 0;
        
        for (int i = 0; i < n; i++)
            count1[s1.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++)
            count2[s2.charAt(i) - 'a']++;
 
        // Count number of characters that are
        // different in both strings
        for (int i = 0; i < MAX_CHAR; i++)
            if (count1[i] > count2[i])
                count = count + Math.abs(count1[i] -  count2[i]);
                
        return (count <= k);
    }
}