class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int maxv=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            maxv=Math.max(maxv,sum);
        }
        return maxv;
    }
}