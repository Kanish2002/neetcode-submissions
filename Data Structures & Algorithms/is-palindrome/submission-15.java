class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!isAlphaNumeric(l)) {
                left++;
                continue;
            }
            if(!isAlphaNumeric(r)){
                right--;
                continue;
            }
            if(toLower(l) != toLower(r)) return false;
            left++;
            right--;    
        }
        return true;
    }
    public char toLower(char c) {
        if(c >= 'A' && c <= 'Z') c+=32;
        return c;
    }
    public boolean isAlphaNumeric(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        return false;
    }
}
