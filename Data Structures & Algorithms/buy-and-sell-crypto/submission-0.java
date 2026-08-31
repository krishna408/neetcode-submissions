class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=Integer.MAX_VALUE;
        int profit=0;
        for(int price: prices){
            if(minSoFar<price) profit=Math.max(profit, price-minSoFar);
            if(minSoFar>price){
                minSoFar=price;
            } 
        }
        return profit;
    }
}
