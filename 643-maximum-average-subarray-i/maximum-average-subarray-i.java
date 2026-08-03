class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }

        double maxAvg = (double) windowSum / k;

        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];

            double currAvg = (double) windowSum / k;

            maxAvg=Math.max(maxAvg,currAvg);
        }

        return maxAvg;
    }
}