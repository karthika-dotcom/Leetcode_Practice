class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]arr=new int[nums.length];
        int ind=0;int mid=n;
        for(int i=0;i<n;i++){
            arr[ind]=nums[i];
            ind++;
            arr[ind]=nums[mid];
            ind++;mid++;
        }
        return arr;
    }
}