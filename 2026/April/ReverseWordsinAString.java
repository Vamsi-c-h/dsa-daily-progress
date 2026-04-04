/*
Problem: Greatest Common Divisor of Strings
Link: https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
*/
import java.util.Arrays;
import java.util.Collections;

class ReverseWordsinAString {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");       
        Collections.reverse(Arrays.asList(words));
        String sentence = String.join(" ", words);
        return sentence;
    }
}