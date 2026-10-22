class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList(set);

        int count = 0;
        int maxCount = 0;
        for(int i = 1; i < list.size();i++){
            if(list.get(i) == list.get(i-1) + 1){
                count++;
                maxCount = maxCount > count ? maxCount : count;
            }
            else{
                count = 0;
            }

        }
        return maxCount+1;
    }
}
