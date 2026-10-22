class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int mid = high/2;

        while(low <= high){
            if(target < numbers[mid]) high = mid-1;
            else if(target > numbers[mid]) low = mid+1;
            else if(target == numbers[mid]) break;
            mid = (low + high)/2;
        }


        for(int i = 0;i<numbers.length;i++){
            for(int j = 0;j < numbers.length;j++){
                if(i!=j){
                    if(numbers[i] + numbers[j] == target){
                        int[] arr = new int[2];
                        arr[1] = i > j ? i : j;
                        arr[0] = i < j ? i : j;
                        return new int[] {arr[0]+1, arr[1]+1};
                    }
                }
            }
        }
        
        return new int[2];
    }
}
