package com.company;

import java.util.Arrays;
import java.util.Collections;


public class ReverseTheSentence {

    public  static String reverseTheSentence(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }



    public  static String reverseTheSentence2(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0 ; i--)
            reversed.append(words[i]).append(" ");

        return reversed.toString().trim();
    }

}
