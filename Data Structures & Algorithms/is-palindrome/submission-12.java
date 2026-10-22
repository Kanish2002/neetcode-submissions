class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);

            boolean isLeftValid = false;
            boolean isRightValid = false;

            if(l >= 'A' && l <= 'Z'){
                l+=32;
                isLeftValid = true;
            }
            else if((l >= 'a' && l <= 'z') || (l >= '0' && l <= '9')){
                isLeftValid = true;
            }

            if(r >= 'A' && r <= 'Z'){
                r+=32;
                isRightValid = true;
            }
            else if((r >= 'a' && r <= 'z') || (r >= '0' && r <= '9')){
                isRightValid = true;
            }

            if(!isLeftValid && isRightValid) {
                left++;
                continue;
            }
            if(isLeftValid && !isRightValid){
                right--;
                continue;
            }

            if(isLeftValid && isRightValid){
                if(l != r) return false;
            }
            left++;
            right--;    
        }
        return true;
    }
}
