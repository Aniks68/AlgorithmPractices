package com.company;





public class queueDemo {
    public static boolean primeString(String s) {
        if (s.length() == 1) return true;

        final int i = s.concat(s).indexOf(s, 1);
        System.out.println(i);
        System.out.println(s.length());
        return (i == s.length());
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(primeString("matt"));
    }
}