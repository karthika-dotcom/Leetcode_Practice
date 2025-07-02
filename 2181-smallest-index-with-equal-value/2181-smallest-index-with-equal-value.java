class Solution {
    public int smallestEqual(int[] nums) {
        int min=Integer.MAX_VALUE;boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i] && min>i){
                min=i;
                flag=true;
            }
        }
        if(flag) return min;
        return -1;
    }
}