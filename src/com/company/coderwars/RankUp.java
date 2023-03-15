package com.company.coderwars;

import java.util.*;
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
//        System.out.println(longestSlideDown(pyramid));
//        System.out.println(JosephusSurvivor(7, 3));
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        System.out.println(recoverSecret(triplets)); // "whatisup"
        System.out.println(recoverSecret2(triplets)); // "whatisup"
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

    public static int JosephusSurvivor(final int n, final int k) {
        List<Integer> list = range(1, n + 1).boxed().collect(Collectors.toList());
        int index = 0;
        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static String recoverSecret(char[][] triplets) {
        List<Character> list = new ArrayList<>();
        for (char[] triplet : triplets) {
            for (char c : triplet) {
                if (!list.contains(c)) {
                    list.add(c);
                }
            }
        }
        for (char[] triplet : triplets) {
            int index1 = list.indexOf(triplet[0]);
            int index2 = list.indexOf(triplet[1]);
            int index3 = list.indexOf(triplet[2]);
            if (index1 > index2) {
                Collections.swap(list, index1, index2);
            }
            if (index2 > index3) {
                Collections.swap(list, index2, index3);
            }
        }
        return list.stream().map(String::valueOf).collect(joining());
    }

    public static String recoverSecret2(char[][] triplets) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        // Build the directed graph and compute the indegree of each vertex
        for (char[] triplet : triplets) {
            for (int i = 0; i < 3; i++) {
                char c = triplet[i];
                graph.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
                if (i > 0) {
                    char prev = triplet[i-1];
                    if (!graph.get(prev).contains(c)) {
                        graph.get(prev).add(c);
                        indegree.put(c, indegree.get(c) + 1);
                    }
                }
            }
        }

        // Perform a topological sort to determine the order of the characters
        List<Character> sorted = new ArrayList<>();
        Queue<Character> queue = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                queue.offer(c);
            }
        }
        while (!queue.isEmpty()) {
            char c = queue.poll();
            sorted.add(c);
            for (char neighbor : graph.getOrDefault(c, Collections.emptySet())) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Convert the sorted list of characters to a string
        StringBuilder sb = new StringBuilder();
        for (char c : sorted) {
            sb.append(c);
        }
        return sb.toString();
    }

    public String recoverSecret3(char[][] triplets) {
        ArrayList<Character> list = new ArrayList<Character>();
        for(char[] c_array : triplets) {
            for(char ch : c_array) {
                if(!list.contains(ch)){
                    list.add(ch);
                }
            }
        }
        boolean more = true;
        while(more){
            more = false;
            for(int i = 0; i < triplets.length; i++){
                for(int j = triplets[i].length-1; j>0; j--){
                    int pos_ch2 = list.indexOf(triplets[i][j]);
                    int pos_ch1 = list.indexOf(triplets[i][j-1]);
                    if(pos_ch2 < pos_ch1){
                        list.add(pos_ch1 + 1, triplets[i][j]);
                        list.remove(pos_ch2);
                        more = true;
                    }
                }
            }
        }


        return list.toString().replaceAll("\\[|\\]|,| ", "");
    }
}
