class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int result=0;
        int major=0;
        for(int n: nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
            if(hs.get(n)>major){
                result=n;
                major=hs.get(n);
            }
        }
        return result;
    }
}