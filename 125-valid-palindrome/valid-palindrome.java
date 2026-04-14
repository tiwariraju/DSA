class Solution {
    public boolean isPalindrome(String s) {
       if(s.length()<1) return false;

       s=s.toLowerCase();

       String cleaned=s.replaceAll("[^a-zA-Z0-9]","");

       int start=0;
       int end=cleaned.length()-1;

       while(start<end){
            if(cleaned.charAt(start)!= cleaned.charAt(end)){
                return false;
            }
            start++;
            end--;
        } 
        return true;
    }
}