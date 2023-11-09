package com.leechcode;

import java.util.HashMap;
import java.util.Map;

public class ConstainsDuplicates {

    public static boolean solution(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
