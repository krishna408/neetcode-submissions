class Solution {
    private int mostFreq(int[] map){
        int size=0;
        for(int i=0;i<26;i++){
            if(size<map[i])
                size=map[i];
        }
        return size;
    }

    public int characterReplacement(String s, int k) {
        int[] map=new int[26];
        int l=0, r=0;
        int maxLen=0;
        for(;r<s.length();r++){
            map[s.charAt(r)-'A']++;
            int currLen=r-l+1;
            while(l< r && l<s.length() && (currLen-mostFreq(map))>k){
                map[s.charAt(l)-'A']--;
                l++;
                currLen=r-l+1;
            }
            maxLen=Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}
