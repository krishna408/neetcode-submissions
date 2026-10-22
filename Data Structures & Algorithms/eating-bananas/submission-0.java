class Solution {
    long getSum(int[] piles, int k){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)piles[i]/k);
        }

        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=1, mid=-1;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high) high=piles[i];
        }

        int ans=high;

        while(low<=high){
            mid=low+(high-low)/2;
            long sum=getSum(piles, mid);
            if(sum<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
