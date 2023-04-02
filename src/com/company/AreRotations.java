package com.company;

public class AreRotations {

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;

        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }

}
