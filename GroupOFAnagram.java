package ritu.leetcodeudemy.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOFAnagram {
    public static void main(String[] args) {

        String[] str = {"eat", "ate", "cat", "atc", "listen", "istenl","mama","ma"};

       Map<String , List<String>> map = Arrays.stream(str)
                .collect(Collectors.groupingBy( words ->{ char[] ch = words.toCharArray();
                        Arrays.sort(ch);
                        return new String(ch);}));
        System.out.println(map.values());

    }
}
