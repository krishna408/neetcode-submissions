class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map=new int[256];
        int l=0, r=0, n=s.length(), maxLen=0;
        for(;r<n;r++){
            if(map[s.charAt(r)]>0 && l<map[s.charAt(r)]){
                l=map[s.charAt(r)];
            }
            maxLen=Math.max(maxLen, r-l+1);
            map[s.charAt(r)]=r+1;
        }
        //maxLen=Math.max(maxLen, r-l+1);
        
        return maxLen;
    }
}
