package ritu.leetcodeudemy.DSA;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "aadaa";
        String s1 = "daaaa";

        char[] c1 = s.toCharArray();
        char[] c2 = s1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }else System.out.println("its not anagram");
    }
    }

