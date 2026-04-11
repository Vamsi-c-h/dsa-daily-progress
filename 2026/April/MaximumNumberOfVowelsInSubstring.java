/*
Problem: Maximum Number of Vowels in a Substring of Given Length
Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75
*/
class MaximumNumberOfVowelsInSubstring {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        max = count;

        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                count++;
            }

            if(isVowel(s.charAt(i-k))){
                count--;
            }

            max = Math.max(max, count);
        }
        return max;


        /*
        int n = s.length() - k + 1;
        int max = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i; j<i+k; j++){
                if(s.charAt(j) == 'a' ||
                s.charAt(j) == 'e' ||
                s.charAt(j) == 'i' ||
                s.charAt(j) == 'o' ||
                s.charAt(j) == 'u'){
                    count++;
                }
                
            }
            max = Math.max(max, count);
        }
        return max;
        */
    }
}