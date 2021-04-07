package com.company;

import java.util.*;

public class StringUtils {

    public static int countVowels(String str) {
        if (str == null)
            return 0;

        int count = 0;
        String vowels = "aeiou";
        for (char ch: str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1)
                count++;
        }
        return count;
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public  static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0 ; i--) {
//            reversed.append(words[i] + " ");
//        }
//        return reversed.toString().trim();
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;

        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }

    public static String removeDuplicates(String str) {
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

    public static String capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty())
            return "";

        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;

        char[] array1 = first.toCharArray();
        Arrays.sort(array1);

        char[] array2 = second.toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(String word) {
        if (word == null)
            return false;

//        StringBuilder stringBuilder = new StringBuilder(word);
//        stringBuilder.reverse();
//        return stringBuilder.toString().equals(word);

        int left = 0;
        int right = word.length() - 1;
        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        return true;
    }

}
