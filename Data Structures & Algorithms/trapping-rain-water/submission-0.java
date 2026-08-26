/*
  0 2 0 3 1 0 1 3 2 1
L 0 2 2 3 3 3 3 3 3 3 
R 3 3 3 3 3 3 3 3 2 1
  0 0 2 0 2 3 2 0 0 0
*/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] lMax=new int[n];
        int[] rMax=new int[n];

        lMax[0]=height[0];
        rMax[n-1]=height[n-1];
        
        for(int i=1;i<n;i++){
            lMax[i]=Math.max(lMax[i-1], height[i]);
            rMax[n-i-1]=Math.max(rMax[n-i], height[n-i-1]);
        }
        int result=0;

        for(int i=0;i<n;i++){
            result+=(Math.min(lMax[i], rMax[i])-height[i]);
        }
        return result;
    }
}
