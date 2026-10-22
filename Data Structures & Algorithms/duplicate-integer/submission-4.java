class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet ht = new HashSet<Integer>();
        for(Integer num : nums){
            if(ht.contains(num)) return true;
            ht.add(num);
        }
        return false;
    }
}