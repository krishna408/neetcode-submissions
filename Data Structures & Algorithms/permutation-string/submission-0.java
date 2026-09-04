class Solution {
    private boolean isMatch(int[] m1, int[] m2){
        for(int i=0;i<26;i++)
            if(m1[i]!=m2[i]) return false;
        return true;    
    }

    public boolean checkInclusion(String s1, String s2) {
        int l=0, r=0, n=s1.length(), m=s2.length();
        if(n>m) return false;

        int[] s1Map=new int[26];
        int[] s2Map=new int[26];
        
        while(r<n){
            s1Map[s1.charAt(r)-'a']++;
            s2Map[s2.charAt(r)-'a']++;
            r++;
        }

        if(isMatch(s1Map, s2Map)) 
            return true;

        while(l<r && r<m){
            s2Map[s2.charAt(l)-'a']--;
            s2Map[s2.charAt(r)-'a']++;

            if(isMatch(s1Map, s2Map))
                return true;    
            l++;
            r++;    
        }
        return false;
    }
}
