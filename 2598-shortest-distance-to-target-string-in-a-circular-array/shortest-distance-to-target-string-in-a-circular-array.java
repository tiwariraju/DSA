class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int minDistance=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int forward=Math.abs(i-startIndex);

                int circular=n-forward;

                int distance = Math.min(forward, circular);

                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance==Integer.MAX_VALUE ? -1: minDistance;
    }
}