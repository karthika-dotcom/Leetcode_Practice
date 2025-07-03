class Solution {
    public int findComplement(int num) {
        StringBuilder str=new StringBuilder();
        while(num>0){
            if(num%2==0){
                str.append(1);
            }
            else{
                str.append(0);
            }
            num/=2;
        }
        String resstring=str.reverse().toString();
        int val=1;int res=0;
        char[]ch=resstring.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='0'){
                res+=(0*val);
            }
            if(ch[i]=='1'){
                res+=(1*val);
            }
            val*=2;
        }
        return res;
    }
}