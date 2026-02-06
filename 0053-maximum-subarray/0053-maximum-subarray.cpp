class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        int s=0;
        int mx=INT_MIN;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            s=s+nums[i];
            mx=max(mx,s);
            if(s<0){
                s=0;
            }
        }
        return mx;
    }
};

// class Solution {
// public:
//     int maxSubArray(vector<int>& nums) {
//         int n=nums.size();
//         int mx=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int s=0;
//                 for(int k=i;k<=j;k++){
//                     s+=nums[k];
//                 }
//                 if(mx<s){
//                     mx=s;
//                 }
//             }
//         }
//         if(n==1){
//             return nums[0];
//         }else{
//         return mx;
//         }
//     }
// };