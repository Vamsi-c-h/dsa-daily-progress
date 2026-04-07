/*
Problem: Increasing Triplet Subsequence
Link: https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
*/
class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= first){
                first = num;
            }
            else if(num <= second){
                second = num;
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}