package com.company;

import java.util.Arrays;

public class Anagrams {

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;

        char[] array1 = first.toCharArray();
        Arrays.sort(array1);

        char[] array2 = second.toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

}
