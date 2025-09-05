class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int f=0;
            while(nums[i]>0){
                f=nums[i]%10;
                nums[i]/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                int last=nums[j]%10;
                if(prime(f,last)) count++;
            }
        }
        return count;
    }
    public boolean prime(int a,int b){
        int gcd=1;
        for(int i=1;i<=(Math.min(a,b));i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        if(gcd==1) return true;
        return false;
    }
}