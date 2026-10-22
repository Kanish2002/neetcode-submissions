class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i < nums.length;i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right) 
                        if(nums[left] == nums[left+1]) left++;
                        else break;
                    while(left < right) 
                        if(nums[right] == nums[right-1]) right--;
                        else break;
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
