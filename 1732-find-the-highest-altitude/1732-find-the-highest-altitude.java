class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int maxv=0;
        for(int s:gain){
            sum+=s;
            maxv=Math.max(maxv,sum);
        }
        return maxv;
    }
}