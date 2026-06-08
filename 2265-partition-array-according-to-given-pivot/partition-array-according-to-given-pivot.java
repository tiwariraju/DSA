class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int idx=0;
        // for less than pivot 
        for (int num : nums) {
            if (num < pivot) {
                ans[idx++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                ans[idx++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                ans[idx++] = num;
            }
        }
        
        return ans;
    }
}