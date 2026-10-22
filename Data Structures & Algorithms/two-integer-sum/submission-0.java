class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int[] arr = new int[2];
        for(i = 0;i < nums.length;i++){
            for(j = 0;j < nums.length;j++){
                if(i != j && nums[i]+nums[j] == target){
                    
                    arr[0] = i > j ? j : i;
                    arr[1] = i < j ? j : i;
                }
            }
        }
        return arr;
    }
}
