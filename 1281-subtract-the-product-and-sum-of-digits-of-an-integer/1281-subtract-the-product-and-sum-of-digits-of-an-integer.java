class Solution {
    public int subtractProductAndSum(int n) {
        int r;
        int sum=0;
        int pro=1;
        while(n>0){
            r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        return (pro-sum);
    }
}