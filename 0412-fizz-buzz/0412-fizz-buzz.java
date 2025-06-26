class Solution {
    public List<String> fizzBuzz(int n) {
       List<String>s=new ArrayList<>();
       String[]arr={"FizzBuzz","Fizz","Buzz"};
       for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            s.add(arr[0]);
        }
        else if(i%3==0){
            s.add(arr[1]);
        }
        else if(i%5==0){
            s.add(arr[2]);
        }
        else{
            s.add(Integer.toString(i));
        }
       } 
       return s;
    }
}