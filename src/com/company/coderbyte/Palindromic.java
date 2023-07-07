package com.company.coderbyte;

public class Palindromic {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("tracetvhasaracecarelotofviews"));
//        System.out.println(isPalindrome("never odd or even"));
    }



    public static String longestPalindromicSubstring(String str) {
        String result = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "");
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
