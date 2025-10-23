class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                c=Character.toLowerCase(c);
                str+=c;
            }
            else{
                continue;
            }
        }
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        if(str.equals(rev.toString())){
            return true;
        }
        return false;
    }
}