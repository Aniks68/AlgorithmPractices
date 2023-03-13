package com.company.coderwars;

import java.util.Arrays;

public class TimeFormatter {

    public static void main(String[] args) {
        System.out.println(formatDuration(129799L));
    }

    public static String formatDuration(long seconds) {
        if (seconds == 0) return "now";
        long[] time = new long[5];
        time[0] = seconds / 31536000;
        time[1] = (seconds % 31536000) / 86400;
        time[2] = (seconds % 86400) / 3600;
        time[3] = (seconds % 3600) / 60;
        time[4] = seconds % 60;
        String[] timeString = new String[5];
        timeString[0] = time[0] > 1 ? " years" : " year";
        timeString[1] = time[1] > 1 ? " days" : " day";
        timeString[2] = time[2] > 1 ? " hours" : " hour";
        timeString[3] = time[3] > 1 ? " minutes" : " minute";
        timeString[4] = time[4] > 1 ? " seconds" : " second";
        StringBuilder result = new StringBuilder();
        int count = (int) Arrays.stream(time).filter(x -> x != 0).count();
//        System.out.println("Count: " + count);

        for (int i = 0; i < 5; i++) {
            if (time[i] != 0) {
                count--;
                result.append(time[i]).append(timeString[i]);
                if (count == 1) {
                    result.append(" and ");
                } else if (count < 4 && i < 4) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }
}
