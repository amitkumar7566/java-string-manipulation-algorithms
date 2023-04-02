package com.company;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        if (word == null)
            return false;

        int left = 0;
        int right = word.length() - 1;

        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;

        return true;
    }


    public static boolean isPalindrome2(String word) {
        if (word == null)
            return false;

        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();

        return stringBuilder.toString().equals(word);
    }

}
