class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int st=0; int end=0;
        int max=1;
        Set<Character>s1=new HashSet<>();
        while(end<s.length()){
            char c=s.charAt(end);
            while(s1.contains(c)){
                s1.remove(s.charAt(st));
                st++;
            }
            s1.add(c);
            int val=end-st+1;
            max=Math.max(val,max);
            end++;
        }
        return max;
    }
}
