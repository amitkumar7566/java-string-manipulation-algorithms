package com.company;

public class ReverseTheWord {

    public static String reverseTheWord(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }

}
