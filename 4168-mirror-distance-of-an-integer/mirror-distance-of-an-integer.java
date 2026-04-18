class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return Math.abs(reversed - n);  
    }
}