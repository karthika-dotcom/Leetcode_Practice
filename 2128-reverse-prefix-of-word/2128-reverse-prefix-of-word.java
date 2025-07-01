class Solution {
    public String reversePrefix(String word, char ch) {
        char[]ch1=word.toCharArray();
        int ind=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==ch){
                ind=i;
                break;
            }
        }
        String val="";
        String str=word.substring(0,ind+1);
        StringBuilder res=new StringBuilder(str);
        res.reverse().toString();
        val+=res;
        for(int j=ind+1;j<word.length();j++){
            val+=ch1[j];
        }
        return val;
    }
}