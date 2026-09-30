package ritu.leetcodeudemy.DSA;

import java.util.HashMap;

public class LongestSubstring {


    public static int longestSubstring(String s){
      int maxLenght = 0;
      int left = 0;
      int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0 ; right < len ; right ++){
            char currentchar= s.charAt(right);
            if (map.containsKey(currentchar)){
                left = Math.max( map.get(currentchar)+1, left);
            }
            map.put(currentchar, right);
            maxLenght = Math.max(maxLenght, right-left+1);
        }


        return maxLenght;
    }
    public static void main(String[] args) {
        String s = "dileepKumar";
        System.out.println(longestSubstring(s));
    }}



