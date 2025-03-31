class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length-1;
        int maxarea = 0;

        while(left < right) {
            int width = right - left;
            int minh = Math.min(height[left] , height[right]);
            int area = width * minh;
            maxarea = Math.max(maxarea , area);

            if(height[left] <= height[right]) left++;
            else right--;
        }
        return maxarea;
    }
}