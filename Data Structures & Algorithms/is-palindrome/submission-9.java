class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                c +=  32 ;
                sb.append(c);
            }
            else if (c >= 'a' && c <= 'z' || c >= '0' && c <= '1') sb.append(c);
            else continue;
        }
        s = sb.toString();
        System.out.println(s);
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)) return true;
            else return false;
        }
        for(int i = 0; i < s.length() / 2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
