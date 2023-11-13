package com.leechcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer x, return true if x is a
//        palindrome
//        , and false otherwise.
//
//
//
//        Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class Palindrome {

    public static boolean isPalindrome1(int x) {

        List<String> intArray = Arrays.stream(String.valueOf(x).split("")).toList();

        List<String> reverseArrayInt = new ArrayList<>();
        
        for (int i = intArray.size() -1 ; i >= 0; i--) {
            reverseArrayInt.add(intArray.get(i));
        }

        return intArray.equals(reverseArrayInt);

    }

    public static boolean isPalindrome2(int x) {

        StringBuilder intString = new StringBuilder(String.valueOf(x));
        intString.reverse();

        return intString.toString().equals(x + "");
    }
}
