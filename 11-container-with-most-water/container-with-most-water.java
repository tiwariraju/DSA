class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left < right){
            int wid=right-left;

            int len=Math.min(height[right],height[left]);

            maxArea=Math.max(maxArea,wid*len);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}