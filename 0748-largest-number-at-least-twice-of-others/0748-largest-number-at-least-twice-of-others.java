class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];int ind=0;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && (nums[i]*2)>max){
                return -1;
            }
        }
        return ind;
    }
}