/*
Problem: Find the Highest Altitude
Link: https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
*/

class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<gain.length; i++){
            sum += gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}