class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }

        
        int maxCount = 0;
        for(int i = 0; i < nums.length;i++){
            if(set.contains(nums[i]-1)){
                int count = 1;
                int current = nums[i];
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
