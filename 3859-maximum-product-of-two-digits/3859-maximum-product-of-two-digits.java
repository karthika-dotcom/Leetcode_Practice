class Solution {
    public int maxProduct(int n) {
        int num=n;int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        num=n;
        int[]arr=new int[count];int ind=0;
        while(num>0){
            arr[ind]=num%10;
            num/=10;
            ind++;
        }
        Arrays.sort(arr);
        int res=arr[count-1]*arr[count-2];
        return res;
    }
}