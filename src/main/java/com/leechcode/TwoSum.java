package com.leechcode;

import java.sql.Array;

public class TwoSum {

    public static int [] solution(int[] nums, int target) {

        for (int i = 0; i <= nums.length - 1; i++) {

            for (int o = i + 1; o <= nums.length - 1; o++) {

                if (nums[i] + nums[o] == target) {
                    return new int[]{i, o};
                }
            }
        }
        return new int[]{};
    }
}
