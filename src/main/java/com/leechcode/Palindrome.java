package com.leechcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
