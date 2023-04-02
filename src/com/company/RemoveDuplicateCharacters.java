package com.company;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static String removeDuplicateCharacters(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch: str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }


}
