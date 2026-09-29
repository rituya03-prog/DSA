package ritu.leetcodeudemy.DSA;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twosum(int target, int[] arr) {

        // int target = 7;
        //int[] arr = {2,3,4,5,1,6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                   // System.out.println(arr[i] + "" +arr[j]);
                    return new int[] {i, j};
                }
            }
        }
       return new int[] {};
    }
    public static int[] twosummap(int target, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];


            if (map.containsKey(sum)) {
                return new int[]{map.get(sum), i};
            }
            map.put(arr[i], i);
        }
            return new int[]{};
        }


    public static void main(String[] args) {

        int[] arr = {2,3,4,5,1,6};
        int[]  result =twosummap(7, arr);
        System.out.println(Arrays.toString(result));
    }
}
