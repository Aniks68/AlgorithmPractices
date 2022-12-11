package com.company;

import java.util.ArrayList;
import java.util.List;

public class SQLTest {
    public void query() {
        List<String> list = new ArrayList<>();
        list.stream().filter(s -> s.length() > 0).forEach(System.out::println);
        String test = "test";

    }

    public int findLargestNumber(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n1 && array[i] < n2) {
                sum += array[i];
            }
        }
        return sum;
    }

    class Counter {
        private int count = 0;
        public void increment() {
            count++;
        }
        public int getCount() {
            return count;
        }
    }

    static int sumRange(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int[] computeFinalPosition(int xLimit, int yLimit, int[] position, int[] portalA, int[] portalB, String moves) {
        int x = position[0];
        int y = position[1];
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
            if (x == portalA[0] && y == portalA[1]) {
                x = portalB[0];
                y = portalB[1];
            } else if (x == portalB[0] && y == portalB[1]) {
                x = portalA[0];
                y = portalA[1];
            }
            if (x < 0) {
                x = 0;
            } else if (x > xLimit) {
                x = xLimit;
            }
            if (y < 0) {
                y = 0;
            } else if (y > yLimit) {
                y = yLimit;
            }
        }
        return new int[]{x, y};
    }
}
