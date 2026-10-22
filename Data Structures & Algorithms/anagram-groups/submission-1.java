class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

        for(int i = 0;i < strs.length;i++){
            int freqArr[] = new int[26];
            for(int j = 0;j < strs[i].length();j++){
                freqArr[strs[i].charAt(j) - 'a']++;
            }
            map.computeIfAbsent(Arrays.toString(freqArr), k -> new ArrayList<String>()).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
