package com.company;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {

    public static char getMaxOccuringChar(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch: str.toCharArray()) {
            if (frequencies.containsKey(ch))
                frequencies.replace(ch, frequencies.get(ch) + 1);
            else
                frequencies.put(ch, 1);
        }

        char key = ' ';
        int maxValue = 0;
        for (char ch: frequencies.keySet()) {
            if (frequencies.get(ch) > maxValue) {
                key = ch;
                maxValue = frequencies.get(ch);
            }
        }
        return key;
    }
    
}
