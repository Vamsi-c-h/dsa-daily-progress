/*
Problem: Reverse Vowels of A String
Link: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
*/
import java.util.ArrayList;
import java.util.List;

class ReverseVowelsofAString {
    public String reverseVowels(String s) {
        int n = s.length();
        int c = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(Character.toLowerCase(s.charAt(i)) == 'a' || 
               Character.toLowerCase(s.charAt(i)) == 'e' || 
               Character.toLowerCase(s.charAt(i)) == 'i' || 
               Character.toLowerCase(s.charAt(i)) == 'o' || 
               Character.toLowerCase(s.charAt(i)) == 'u'){
                    arr.add(i);
                    c++;
            }
        }
        
        char[] chars = new char[arr.size()];

        for(int i = 0; i < arr.size(); i++){
            chars[i] = s.charAt(arr.get(i));
        }

        char[] str = s.toCharArray();

        int j = 0;
        for(int i = arr.size() - 1; i >= 0; i--){
            str[arr.get(i)] = chars[j];
            j++;
        }

        return new String(str);
    }
}