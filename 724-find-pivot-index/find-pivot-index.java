class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;

        // total sum 
        for(int num:nums){
            totalsum+=num;
        }
        
        int leftsum=0;
        // now need to find right sum 
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];

            if(rightsum==leftsum){
                return i;
            }

            leftsum+=nums[i];
        }
        return -1;
    }
}