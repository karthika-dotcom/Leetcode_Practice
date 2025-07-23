class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0;int val=0;
        while(k>0){
            res+=(nums[nums.length-1]+val);
            val++;
            k--;
        }
        return res;
    }
}