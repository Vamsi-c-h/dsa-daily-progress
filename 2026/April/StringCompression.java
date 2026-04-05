/*
Problem: Greatest Common Divisor of Strings
Link: https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
*/
class StringCompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;

        while(i<n){
            char curr = chars[i];
            int count = 0;

            while(i<n && chars[i] == curr){
                i++;
                count++;
            }

            chars[index++] = curr;

            if(count > 1){
                String s = String.valueOf(count);
                for(char c : s.toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}