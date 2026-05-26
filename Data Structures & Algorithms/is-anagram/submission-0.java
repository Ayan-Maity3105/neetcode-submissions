class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> s1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> s2 = new HashMap<Character,Integer>();

        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i=0; i<s.length(); i++) {
            s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0) + 1);
            s2.put(t.charAt(i), s2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return s1.equals(s2);
    }
}
