class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }

        int count = 0;
        int current = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length;i++){
            if(set.contains(nums[i]-1)){
                current = nums[i];
                count = 1;
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                maxCount = maxCount > count ? maxCount : count;
            }
        }
        return maxCount+1;
    }
}
