class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ht = new HashSet<>();
        for(int num : nums){
            if(ht.contains(num)) return true;
            ht.add(num);
        }
        return false;
    }
}