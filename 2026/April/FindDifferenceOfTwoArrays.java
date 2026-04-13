/*
Problem: Find the Difference of Two Arrays
Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
*/

class FindDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lis = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for(int num : nums1){
            l1.add(num);
        }
        List<Integer> l2 = new ArrayList<>();
        for(int num : nums2){
            l2.add(num);
        }
        List<Integer> notinl2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++){
            if(!(l2.contains(l1.get(i)))){
                if(!(notinl2.contains(l1.get(i)))){
                    notinl2.add(l1.get(i));
                }
                
            }
        }
        lis.add(notinl2);
        List<Integer> notinl1 = new ArrayList<>();
        for(int i=0; i<l2.size(); i++){
            if(!(l1.contains(l2.get(i)))){
                if(!(notinl1.contains(l2.get(i)))){
                    notinl1.add(l2.get(i));
                }
                
            }
        }
        lis.add(notinl1);
        return lis;
    }
}