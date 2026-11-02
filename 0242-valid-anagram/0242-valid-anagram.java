class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
      HashMap<Character,Integer> f1=new HashMap<>();
      for(char c1:s.toCharArray()){
        f1.put(c1,f1.getOrDefault(c1,0)+1);
      }
      HashMap<Character,Integer> f2=new HashMap<>();
      for(char c2:t.toCharArray()){
        f2.put(c2,f2.getOrDefault(c2,0)+1);
      }

      if(f1.equals(f2)) return true;
      return false;
    }
}