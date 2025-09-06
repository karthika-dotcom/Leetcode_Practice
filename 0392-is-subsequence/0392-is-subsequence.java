class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character>st=new LinkedList<>();
        for(char c:t.toCharArray()){
            st.add(c);
        }
        //int count=0;
        for(char c:s.toCharArray()){
            if(!st.contains(c)){
                return false;
            }
            while(st.contains(c)){
                char ch=st.peek();
                st.remove();
                if(ch==c) break;
            }
        }
        return true;
    }
}