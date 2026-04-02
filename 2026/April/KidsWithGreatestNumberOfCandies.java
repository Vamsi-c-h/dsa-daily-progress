/*
Problem: Kids With the Greatest Number of Candies
Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
*/

import java.util.ArrayList;
import java.util.List;

class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int num : candies){
            if(num>max){
                max = num;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int num : candies){
            if(num + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}