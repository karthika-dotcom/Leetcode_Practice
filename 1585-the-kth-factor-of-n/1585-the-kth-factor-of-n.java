class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0) l.add(i);
        }
        for(int i=0;i<l.size();i++){
            if(i==k-1) return l.get(i);
        }
        return -1;
    }
    
}