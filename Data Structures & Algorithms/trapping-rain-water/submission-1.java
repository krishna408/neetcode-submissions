class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        int result=0;
        for(int i=0; i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]<=height[i]){
                int mid=height[st.pop()];
                int left=st.isEmpty()?0:height[st.peek()];
                if(mid<Math.min(left, height[i])){
                    int w=i-st.peek()-1;
                    result+=(Math.min(left, height[i])-mid)*w;
                    }
            }
            st.push(i);
        }

        return result;
    }
}
