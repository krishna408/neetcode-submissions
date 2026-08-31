class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map=new int[256];
        int l=0, r=0, n=s.length(), maxLen=0;
        for(;r<n;r++){
            map[s.charAt(r)]++;
            while(l<n && map[s.charAt(r)]>1){
                map[s.charAt(l)]--;
                l++;
            }
            maxLen=Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
