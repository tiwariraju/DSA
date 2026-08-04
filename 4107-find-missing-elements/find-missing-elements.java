class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();

        Arrays.sort(nums);

        int currNum=nums[0];

        for(int i=0;i<nums.length;currNum++,i++){
            if(currNum < nums[i]){
                list.add(currNum);
                i--;
            }
        }
        return list;
    }
}