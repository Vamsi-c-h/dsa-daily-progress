/*
Problem: Unique Number of Occurrences
Link: https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
*/

class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> result = new HashSet<Integer>(map.values());
        if(map.size()>result.size()){
            return false;
        }
        return true;
    }
}