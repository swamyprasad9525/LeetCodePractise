class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            c=Character.toLowerCase(c);
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        // StringBuilder sb1=new StringBuilder(sb);
        // sb=sb.reverse();
        // if(!sb1.equals("")){
        //   return true;  
        // } 
        // else if(!sb.equals(sb1)){
        //     return true;
        // } 
        // else{
        //     return false;
        // } 
        if(sb.equals(" ")) return true;
        int l=0;
        int r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)==sb.charAt(r)) {
            l++;
            r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}