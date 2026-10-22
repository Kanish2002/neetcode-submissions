class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }

        
        int maxCount = 0;
        for(int num : nums){
            if(set.contains(num-1)){
                int count = 1;
                int current = num;
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
