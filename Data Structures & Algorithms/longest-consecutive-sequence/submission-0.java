class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<>();
        for(int num: nums){
            map.add(num);
        }
        int maxLen=0;
        for(int num: nums){
            int start=num;
            if(map.contains(start-1)) continue;
            while(map.contains(start+1)){
                start++;
            }
            if(maxLen<(start-num+1))
                maxLen=start-num+1;
        }
        return maxLen;
        }
}
