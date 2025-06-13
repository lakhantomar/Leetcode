class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n] ; 
        int i = 0 ; int k = 0 ; 

        while( n < nums.length ) {
            arr[k++] = nums[i++]  ; 
            arr[k++] = nums[n++] ; 
        }
        return arr ; 
    }
}