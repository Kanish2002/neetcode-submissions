class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeMap ht = new TreeMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++){
            ht.put(nums[i],ht.getOrDefault(nums[i]++,1));
        }
        if(ht.size() != nums.length) return true;
        else return false;
    }
}