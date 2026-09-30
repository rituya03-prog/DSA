package ritu.leetcodeudemy.DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1};
        HashSet<Integer> set = new HashSet<>();

        System.out.println(Arrays.stream(arr).boxed().filter( i -> set.add(i)).collect(Collectors.toSet()));



    }
}
