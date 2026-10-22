class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> ht = new TreeSet<>();
        for(int num : nums){
            if(ht.contains(num)) return true;
            ht.add(num);
        }
        return false;
    }
}