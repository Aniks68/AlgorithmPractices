package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prosper {


    public static void main(String[] args) {
        System.out.println(findTheDifference("abc", "abc"));
        int[] one = new int[4];
        Arrays.stream(one).toArray();
    }

    public static char findTheDifference(String s, String t) {
        var ss = toDictionary(s);
        var tt = toDictionary(t);
        var isFoundOne = isFound(s, ss, tt);
        return isFoundOne == '0' ? isFound(t, ss, tt) : isFoundOne;
    }

    public static Map<Character, Integer> toDictionary(String s) {
        Map<Character, Integer> foo = new HashMap<>();
        for(char t: s.toCharArray()) {
            if(foo.containsKey(t)) {
                foo.put(t, foo.get(t) + 1);
            } else {
                foo.put(t, 1);
            }
        }
        return foo;
    }

    public  static char isFound(String s, Map<Character, Integer> ss, Map<Character, Integer> tt) {
        for(char w: s.toCharArray()) {
            if(!tt.containsKey(w) || tt.get(w) != ss.get(w)) {
                return w;
            }
        }
        return '0';
    }
}
