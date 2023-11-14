package com.leechcode;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {

    public static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer number : a) {
            map.put(number, map.containsKey(number) ? map.computeIfPresent(number, (key, val) -> val + 1) : Integer.valueOf(1));
        }

        return map.entrySet().stream().filter(key -> key.getValue() % 2 > 0).toList().get(0).getKey();


    }
}
