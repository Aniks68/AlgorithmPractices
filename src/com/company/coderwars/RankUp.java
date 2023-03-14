package com.company.coderwars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public class RankUp {
    public static void main(String[] args) {
        System.out.println("Hello from CodeWars!");
//        int[] arr = {34, 5, 8, -6, -3, -2, -1, 2, 10, 15, 16, 18, 19, 20};
//        System.out.println(rangeExtraction(arr));
//
//        System.out.println(arr[0] + range(1, arr.length).mapToObj(i -> (arr[i - 1] == arr[i] - 1 ? "~" : ",") + arr[i])
//                .collect(joining()).replaceAll("~([^,]+)~+", "-").replace("~", ","));

        int[][] pyramid = new int[][]{
                {1},
                {2, 3},
                {11, 5, 6},
                {7, 8, 9, 30}
        };
        System.out.println(longestSlideDown(pyramid));
    }

    public static String rangeExtraction(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println(list);
        List<String> result = new ArrayList<>();
        int start = list.get(0);
        int end = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != end + 1) {
                listSort(result, start, end);
                start = list.get(i);
            }
            end = list.get(i);
        }
        listSort(result, start, end);
        return String.join(",", result);
    }

    private static void listSort(List<String> result, int start, int end) {
        if (start == end) {
            result.add(String.valueOf(start));
        } else if (end - start == 1) {
            result.add(String.valueOf(start));
            result.add(String.valueOf(end));
        } else {
            result.add(start + "-" + end);
        }
    }

    public static int longestSlideDown(int[][] pyramid) {
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        return pyramid[0][0];
    }
}
