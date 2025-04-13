class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        // Creating a List<Integer> .
        List<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
             int flag=0;
             int num=i;
             int temp=i;
             while(temp!=0){
                int rem=temp%10;
                if(rem==0){
                    flag=1;
                    break;
                }
                if(num%rem!=0){
                    flag=1;
                    break;
                }
                temp/=10;
            }
            if(flag==0){
                arr.add(i);
            }
        }
        return arr;
    }
}