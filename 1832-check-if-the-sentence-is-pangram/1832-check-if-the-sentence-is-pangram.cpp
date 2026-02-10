class Solution {
public:
    bool checkIfPangram(string sentence) {

        vector <int> freq(26,0);
        for(char c:sentence){
            freq[c-97]++; //97 is the ascii value of "a" 
        }
        for(int i:freq){
            if(i==0){
                return 0;
            }
        }
        return 1;
    }
};