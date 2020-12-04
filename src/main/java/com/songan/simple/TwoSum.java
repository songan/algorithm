package com.songan.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author songan
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] target = twoSum(new int[] {2, 7, 11, 15}, 26);
        System.out.println("index=" + target[0] + ","+ target[1]);
    }
}