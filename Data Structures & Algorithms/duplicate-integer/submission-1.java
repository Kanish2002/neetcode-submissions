class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet ht = new TreeSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            ht.add(nums[i]);
        }
        if(ht.size() != nums.length) return true;
        else return false;
    }
}