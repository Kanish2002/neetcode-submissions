class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int maxCount = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            int count = 0;
            for(int j = i+1;j < nums.length;j++){
                if(nums[j] == nums[i]+count+1){
                    count++;
                    maxCount = count > maxCount ? count : maxCount;
                }
            }
        }
        return maxCount+1;
    }
}
