class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(int i = 0;i < strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key, k -> new ArrayList<String>()).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
