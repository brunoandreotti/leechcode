package com.leechcode;

//Count the number of Duplicates
//        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//        Example
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'
//        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//        "indivisibility" -> 1 # 'i' occurs six times
//        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//        "aA11" -> 2 # 'a' and '1'
//        "ABBA" -> 2 # 'A' and 'B' each occur twice


import java.util.HashMap;
import java.util.Map;


public class CountingDuplicates {

    public static int duplicateCount(String text) {

        String[] splittedText = text.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String letter : splittedText) {

            if (map.containsKey(letter)) {
                map.compute(letter, (key, value) -> (value == null) ? 1 : value +1);
            } else {
                map.put(letter, 1);
            }
        }

        return map.entrySet().stream().filter(key -> key.getValue() > 1).toList().size();

    }

    public static int duplicateCount2(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char letter : text.toLowerCase().toCharArray()) {
            map.put(letter, map.containsKey(letter) ? 1 : 0);
        }
        return (int) map.values().stream().filter(value -> value > 0).count();

    }

}
