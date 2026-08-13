class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int mins=prices[0];
        int maxs=0;
        for(int i=0;i<prices.length;i++){
            mins=Math.min(mins,prices[i]);
            int cp=prices[i]-mins;
            maxs=Math.max(maxs,cp);

        }
        return maxs;
    }
}