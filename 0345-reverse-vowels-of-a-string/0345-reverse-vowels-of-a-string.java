class Solution {
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        char[]ch=s.toCharArray();
        int st=0; int end=ch.length-1;
        while(st<end){
            if(str.indexOf(ch[st])!=-1 && str.indexOf(ch[end])!=-1){
                char temp=ch[st];
                ch[st]=ch[end];
                ch[end]=temp;
                st++; end--;
            }
            else if(str.indexOf(ch[st])!=-1 && str.indexOf(ch[end])==-1){
                end--;
            }
            else if(str.indexOf(ch[st])==-1 && str.indexOf(ch[end])!=-1){
                st++;
            }
            else{
                st++;end--;
            }
        }
        return new String(ch);
        
    }
}