class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int major = n / 3;

        HashMap<Integer, Integer> hash = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Step 1: Count complete frequency
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        // Step 2: Traverse HashMap
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (value > major) {
                list.add(key);
            }
        }

        return list;
    }
}