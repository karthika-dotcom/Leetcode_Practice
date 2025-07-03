class Solution {
    public int reverseDegree(String s) {
        int res=0;int ind=1;
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int val='z'-ch[i]+1;
            res+=(val*ind);
            ind++;
        }
        return res;
    }
}