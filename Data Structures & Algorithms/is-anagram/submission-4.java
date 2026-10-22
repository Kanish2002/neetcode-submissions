class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> hm1 = new HashMap<Character,Integer>();
        Map<Character, Integer> hm2 = new HashMap<Character,Integer>();

        for(Character c1 : s.toCharArray()) hm1.put(c1, hm1.getOrDefault(c1,0) + 1);
        for(Character c2 : t.toCharArray()) hm2.put(c2, hm2.getOrDefault(c2,0) + 1);

        System.out.println(hm1);
        System.out.println(hm2);

        for(char c1 : hm1.keySet()){
            if(!hm2.containsKey(c1) || (!hm1.get(c1).equals(hm2.get(c1)))) return false;
        }
        return true;
    }
}
