class Solution {
    public int lengthOfLastWord(String s) {
        char[]arr=s.toCharArray();
        int count=0;
        int space=1;
        for(int i=s.length()-1;i>=0;i--){
            if(arr[i]==' '){
                space++;
            }
            else{
                break;
            }
        }
        for(int i=s.length()-space;i>=0;i--){
            if(arr[i]!=' '){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}