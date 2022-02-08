package com.company;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;
//import static org.graalvm.compiler.phases.common.inlining.walker.InliningIterator.count;

public class Solution {

    public static void main(String[] args) throws IOException {

//        System.out.println(Arrays.toString(createArray(3)));
//       int[] arr = new int[]{1, 2,3,4, 5};
//       int[] barr = new int[]{7, 7, 3, 8, 5, 7, 3, 8, 2, 9, 7};
//       int[] stats = new int[]{6,2, 3, 16, 12, 14, 8};

//        System.out.println(Arrays.toString(replaceArray(arr)));
//        System.out.println(Arrays.toString(firstReverse(arr)));
//        System.out.println(Arrays.toString(arrayJoin(arr, barr)));
//        System.out.println(Arrays.toString(splitArray(barr, 3, 7)));
//        System.out.println(isSmooth(barr));
//        System.out.println(checkPrime("Thunderclaps"));
//        System.out.println(Arrays.toString(replaceMiddle(arr)));
//        System.out.println(makeConsecutive(stats));
//        System.out.println(2>>13);
//        System.out.println(spinWords("This is easy here and there"));
//        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));
//        System.out.println(integerToRoman(64));
//        System.out.println(isPower(72));
//
//        List<String> javaGuys = new ArrayList<>();
//        javaGuys.add("Mark");
//        javaGuys.add("Chukwuma");
//        javaGuys.add("Makera");
//        javaGuys.add("Emeka");
//        javaGuys.add("Jerry");
//        javaGuys.add("Elvis");
//        javaGuys.add("Ikechukwu");
//        javaGuys.add("Prosper");
//        javaGuys.add("Ikechukwu");
//
//
//        System.out.println("The unsorted list is: " + javaGuys);
//        System.out.println("==============================================");
//        Collections.sort(javaGuys);
//        System.out.println("The sorted list is: "+ javaGuys);
//        Collections.reverse(javaGuys);
//        System.out.println("==============================================");
//        System.out.println("The reverse order sorted list is: " + javaGuys);
//
//        System.out.println(mapTest());
//
//        System.out.println(Integer.toBinaryString(37));
//        System.out.println(Integer.parseInt("100001", 2));
//
//        System.out.println(triangleBuilder(18));
//        var x = arrayRotation(new int[]{10, 20, 30, 40, 50}, 2);

//        System.out.println(shiftedDiff("fatique", "tiquefa"));
        //
//        System.out.println(dna("ATCG"));

//        List<Integer> num = List.of(1, 2, 3, 4, 5,6,7);
//        Predicate<Integer> in = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        };

//        Socket socket = new Socket("127.0.0.1", 5000);
//        InputStreamReader inputStream = new InputStreamReader(socket.getInputStream());
//        BufferedReader reader = new BufferedReader(inputStream);
//        String message = reader.readLine();

//        List<Integer> collect = num.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer x) {
//                return x > 5 && x < 8;
//            }
//        }).collect(Collectors.toList());
//        System.out.println(collect);
//        int[] builds = new int[]{3, 5, 4, 4, 3, 1, 3, 2};
//        int[] builds2 = new int[]{3, 5, 4, 4, 3, 1, 3, 2};
//        System.out.println(sunsetViews(builds, "EAST"));
//        System.out.println(sunsetViews(builds2, "WEST"));
//        int[] exampleTest1 = new int[]{Integer.MAX_VALUE, 0, 1};
//        System.out.println(find(exampleTest1));
//        System.out.println(countBinarySubstrings("00110"));
//        assertEquals(new ArrayList<ArrayList<String>>(Arrays.asList(new ArrayList<String>(Arrays.asList("1", "two was here", "3")),
//                        new ArrayList<String>(Arrays.asList("4", "5", "6"))));
//        System.out.println(parseCSV("1,\"two was here\",3\n4,5,6", ",", "\""));
//        System.out.println(dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));

//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
//        int count = 1;
//        System.out.println(singlifyArr(arr,  count));

//        int[] arr = new int[]{24, 85, 0};
//        System.out.println(arrayPacking(arr));
//        System.out.println(numberToRoman(1666));
//        System.out.println(uniqueXters("abbcdefg"));
//        System.out.println(atmMachine(490));
//        System.out.println(lowHigh("3 4 2 9 -4"));
//        System.out.println(vowelCount("superstitious"));
//        System.out.println(filterList(Arrays.asList(1, 2, "a", "b", 417, "aasf", -7612, "1", "123", 231)));
//        System.out.println(highOrderBitmask(220));
        String[] processes = new String[]{"gather:field:wheat","bake:flour:bread","mill:wheat:flour"};
        List<String> trial = Arrays.asList("gather:field:wheat","mill:wheat:flour","bake:flour:bread");
        System.out.println((countChange("field", "bread", trial)));
    }

    public static boolean compare(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;

        if(a != null && b != null) return (compare(a.right, b.right) && compare(a.left, b.left) && (a.val == b.val));

        return false;
    }

    @Data
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
    }


    /*

    QUESTION
    Task
    For this challenge, you will be finding the most efficient set of steps to get from one item to another.Inputs
    You will write a function which will be provided with a set of processes that each convert from one item to another.These will be provided as an array,
    with each process in the form of "process_name:from_item:to_item". For example, you might have a process named "smelt" that converts ore into a metal,
    like this: "smelt:ore:metal".You will also be passed in the initial start item and desired end item for the overall workflow.Note: For simplicity,
    all processes and items will be simple alphanumeric strings.Output
    Given these three inputs, your task is to determine which processes will complete the task in the shortest number of steps. Once you have done so,
    return the names of these processes, in order, as an array.If no steps are needed (because the start and end item is the same), or if you cannot find a valid set of
    processes to get from the start to the end, return an empty array.Specification
    Challenge.countChange(startItem, endItem, tasks)
    Parameters
    startItem: String - Item to start withendItem: String - Item to try to reachtasks: String[] - A mapping of strings from one item to another in the
    format "process_name:from_item:to_item"Return Value
    String[] - A list of processes that convert start item to end item, if it existsExamples
    start_item end_item tasks Return Value
    "field" "bread" ["gather:field:wheat","bake:flour:bread","mill:wheat:flour"] ["gather","mill","bake"]
    "field" "ferrari" ["gather:field:wheat","bake:flour:bread","mill:wheat:flour"] []
    "field" "field" ["gather:field:wheat","bake:flour:bread","mill:wheat:flour"] []
     */

    public static List<String> countChange(String startItem, String endItem, List<String> processes) {
        String[] test = processes.toArray(new String[0]);
        List<String> finProcess = new ArrayList<String>(), noList = new ArrayList<>();

        String[] finalProcess = new String[3];
        String[][] innerArr = new String[3][];
        int checkCount = (int) Arrays.stream(test).filter(el -> el.contains(":" + startItem) || el.contains(":" + endItem)).count();
        final List<String> resultCheck = Arrays.stream(test).filter(el -> el.contains(":" + startItem) || el.contains(":" + endItem)).collect(toList());

        if((resultCheck.size() != 2) || startItem.equals(endItem)) return noList;
        Arrays.stream(test).forEach(el -> {
            if (el.contains(":" + startItem)) innerArr[0] = el.split(":");
            if (el.contains(":" + endItem)) innerArr[2] = el.split(":");
            if (!el.contains(":" + startItem) && !el.contains(":"+endItem)) innerArr[1] = el.split(":");
        });

        if(innerArr[0][2].equals(innerArr[1][1]) && innerArr[1][2].equals(innerArr[2][1])) {
            IntStream.range(0, innerArr.length).forEach(i -> finalProcess[i] = innerArr[i][0]);
            finProcess = Arrays.stream(finalProcess).collect(toList());
            return finProcess;
        }
        return noList;
    }

    /*
    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
    Example
    Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
    Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
    Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)
    */

    public static List<?> filterList(List<?> list) {
        return list.stream().filter(x -> x.getClass().equals(Integer.class)).collect(Collectors.toList());
    }

    /*
    * Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
    */

    public static int vowelCount(String words) {
        List<String> count = new ArrayList<>();
        List<String> vowels = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u"));

        for(String ch : words.split("")) {
            if(vowels.contains(ch)) {
                count.add(ch);
            }
        }
        return count.size();
    }

    /*
    QUESTION 8
    When working with binary numbers, we can use bitmasks to turn on/off certain bits.

    For example, if we take the binary representation of the decimal value 220 (1101 1100) and we wanted to extract the higher 4 bits,
    we could use a bitmask with the boolean AND operation:

    1101 1100 (220)
    AND 1111 0000 (240)
    _________
    1101 0000 (208)
    Put simply, 220 AND 240 is 208. 240 acts as our bitmask while 208 is the value of the high order bits stored by the
    binary representation of the decimal value 220.

    Task
    Let's write a function called highOrderBitmask that, when given a word size in bits, will return us the decimal value for the
    bitmask we'll need to extract the higher order bits out of a word of that same bit size.
    In our example above, the word size was 8 bits, and we wanted to extract the most significant half or the left-most 4 bits.

    All given word sizes will be even
     */

    public static int highOrderBitmask(int num) {
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(240));
        System.out.println(Integer.parseInt("11010000", 2));
        return 0;
    }

    /*
    * QUESTION 7
    From a string of numbers, return the highest and the lowest value as a string. For example:
    "3 4 2 9 -4" -> "-4 9"
    * */

    public static String lowHigh(String numbers) {
        String[] strArr = numbers.split(" ");
        List<Integer> collect = Arrays.stream(strArr).map(Integer::valueOf).sorted().collect(toList());
        return collect.get(0) + " " + collect.get(collect.size()-1);
    }

    /*
     * You are given an array of up to four non-negative integers, each less than 256.
     * Your task is to pack these integers into one number M so that the first element of the array occupies the first (or least significant) 8 bits of M; the second element occupies next 8 bits, and so on.
     * Return the obtained integer M as unsigned integer.
     * Note
     * As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
     * For further clarification see the following example.
     * Specification
     * Challenge.arrayPacking(array)
     * Parameters
     * array: List<Integer> - up to four unsigned integers
     * Return Value
     * Integer - an unsigned integer
     * Constraints
     * array.length == 3
     * 0 ≤ array[i] < 256
     * Example
     * For [24, 85, 0] the output should be 21784
     * [24, 85, 0 ] - The initial array
     * [00011000, 01010101, 00000000] - Translate each number to Binary
     * 000000000101010100011000 - Compact to a single number
     * 21784 - Translate to Decimal
     */

    public static int arrayPacking(int[] arr) {
    String strArr = "";
    for(int i = arr.length - 1; i >= 0; i--) {
        strArr += String.format("%8s", Integer.toBinaryString(arr[i])).replace(' ', '0');
    };
    int decimal=Integer.parseInt(strArr,2);
    return decimal;
}

    /* Create a function taking a positive integer as its parameter and returning a string
containing the Roman Numeral representation of that integer.
Modern Roman numerals are written by expressing each digit
separately starting with the left most digit and skipping any digit
with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM,
90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.*/

    public static String numberToRoman(int num) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    /*
    QUESTION 5
     * <===========MONDAY===========>
     * Task
     * Write a program to determine if a string contains all unique characters. Return true if it does and false otherwise.
     *
     * The string may contain any of the 128 ASCII characters.
     *
     * Specification
     * Challenge.hasUniqueChars(str)
     * Parameters
     * str: String - The string that may or may not contain all unique characters
     *
     * Return Value
     * boolean - True if all characters in the string are unique
     *
     * Examples
     * str Return Value
     * "abcdefg" true
     * "abbcdefg" false
     */

    public static boolean uniqueXters(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j) && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
    QUESTION 6
     * <=============TUESDAY============>
     * An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
     *
     * Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible, determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
     *
     * Here is the specification for the withdraw method you'll complete:
     *
     * Challenge.withdraw(amount)
     * Parameters
     * amount: Integer - Amount of money to withdraw. Assume that the amount is always divisible into 100, 50 and 20 bills.
     *
     * Return Value
     * Integer[] - An array of 3 integers representing the number of 100, 50 and 20 dollar bills needed to complete the withdraw (in that order).
     *
     * Constraints
     * 40 ≤ amount ≤ 1000
     *
     * Examples
     * amount Return Value
     * 250 [2,1,0]
     * 260 [2,0,3]
     * 370 [3,1,1]
     */

    public static int[] atmMachine(int amount) {
        int firstbill = 0;
        int secondbill = 0;
        int thirdbill = 0;
        if (amount >= 100) {
            firstbill = (int) Math.floor(amount / 100);
            amount -= (firstbill * 100);
        }
        if (amount >= 50 && amount % 20 != 0) {
            secondbill = (int) Math.floor(amount / 50);
            amount -= (secondbill * 50);
        }
        if (amount % 20 == 0) {
            thirdbill = amount / 20;
        }

        int[] result = {firstbill, secondbill, thirdbill};
//        return Arrays.toString(arr);

        Arrays.stream(result).forEach(System.out::println);
        return result;
    }

    /*
    QUESTION 1
    Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive),
    perform the following operations until the array contains only one element:
            * <p>
* On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
* On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
            * After the algorithm has finished, there will be a single element left in the array. Return that element.
* <p>
* Specification
* Challenge.packArray(arr)
            * <p>
* Parameters
* arr: Integer[] - An array of integers to be packed
* Return Value
* Integer - The final product
* Constraints
* arr.length == 2k
* 0 ≤ k ≤ 5
            * -9 ≤ arr[i] ≤ 99
            * Example:
            * For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.
            * We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.
            */

    public static int singlifyArr(int[] arr, int count) {

        int position = 0;
        int[] newArr = new int[arr.length/2];
        if (count%2 > 0) {
            oddIteration(arr, position, newArr);
         }

        if (count%2 < 1) {
            evenIteration(arr, position, newArr);
        }
        count++;
        return newArr.length > 1 ? singlifyArr(newArr, count) : (newArr[0]);
    }

    private static void evenIteration(int[] arr, int position, int[] newArr) {
        for (int i = 0; i < arr.length-1; i+=2) {
            newArr[position] = (arr[i] * arr[i+1]);
            position++;
        }
    }

    private static void oddIteration(int[] arr, int position, int[] newArr) {
        for (int i = 0; i < arr.length-1; i+=2) {
            newArr[position] = (arr[i] + arr[i+1]);
            position++;
        }
    }

    public static String[] dirReduc(String[] arr) {
        // Your code here.
//        List<String> finAns = new ArrayList<>();
//        for(int i =0; i < arr.length-1; i++) {
//            if (arr[i].equals("\"NORTH\"")) {
//                if ((arr[i + 1].equals("\"EAST\"")) || (arr[i + 1].equals("\"WEST\"")) || (arr[i + 1].equals("\"NORTH\""))) {
//                    finAns.add(arr[i + 1]);
//                }
//            }
//
//            if (arr[i].equals("\"SOUTH\"")) {
//                if ((arr[i + 1].equals("\"EAST\"")) || (arr[i + 1].equals("\"WEST\"")) || (arr[i + 1].equals("\"SOUTH\""))) {
//                    finAns.add(arr[i + 1]);
//                }
//            }
//
//            if (arr[i].equals("\"EAST\"")) {
//                if ((arr[i + 1].equals("\"NORTH\"")) || (arr[i + 1].equals("\"SOUTH\"")) || (arr[i + 1].equals("\"EAST\""))) {
//                    finAns.add(arr[i + 1]);
//                }
//            }
//
//            if (arr[i].equals("\"WEST\"")) {
//                if ((arr[i + 1].equals("\"NORTH\"")) || (arr[i + 1].equals("\"SOUTH\"")) || (arr[i + 1].equals("\"WEST\""))) {
//                    finAns.add(arr[i + 1]);
//                }
//            }
//        }
//        return finAns.toArray(new String[finAns.size()]);
////        return new String[] {};
            // Your code here.
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (("NORTH".equals(arr[i]) && "SOUTH".equals(arr[i + 1])) ||
                    ("SOUTH".equals(arr[i]) && "NORTH".equals(arr[i + 1])) ||
                    ("EAST".equals(arr[i]) && "WEST".equals(arr[i + 1])) ||
                    ("WEST".equals(arr[i]) && "EAST".equals(arr[i + 1]))) {
                arr[i] = null;
                arr[i + 1] = null;
            }
        }
        final String[] newArr = Arrays.stream(arr)
                .filter(s -> s != null)
                .toArray(String[]::new);
        if (newArr.length == arr.length) {
            return arr;
        } else {
            return dirReduc(newArr);
        }

        /*
        List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
      for (int i = 0; i + 1 < dirs.size(); i++) {
        if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
          dirs.remove(i + 1);
          dirs.remove(i);
          i = -1;
        }
      }
      return dirs.toArray(new String[dirs.size()]);
         */
    }

    public static ArrayList<ArrayList<String>> parseCSV(String csv, String separator, String quote) {
        ArrayList<ArrayList<String>> finArrList = new ArrayList<>();

        String[] strArr = csv.split("\n");

        for(String el : strArr) {
            String[] secondSplit = el.split(separator);
            ArrayList<String> secondList = new ArrayList<>();
            for(String i : secondSplit) {
                if(i.startsWith(quote)) {
                    StringBuilder sb = new StringBuilder(i.substring(1, i.length()-1));
                    i = String.valueOf(sb);
                }
                secondList.add(i);
            }
            finArrList.add(secondList);
        }

        return finArrList;
    }

    public static int countBinarySubstrings(String s) {
//        String[] strArr = s.split("");
//        int count = 0;
//        for (int i = 0; i < strArr.length-2; i++) {
//            if ((!strArr[i].equals(strArr[i+1])) || ((strArr[i].equals(strArr[i+1]) && (strArr[i+2].equals(strArr[i+3]))))) {
//                count++;
//            }
//        }
//        return count;
        int current = 1, previous = 0, ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                current++;
            } else {
                ans += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        } return ans + Math.min(current, previous);
    }

    public static int find(int[] integers) {
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();
        Integer outlier = null;

        for (int i : integers) {
            if (i%2 == 0) {
                evenNum.add(i);
            } else if (i % 2 == 1) {
                oddNum.add(i);
            }
        }

        if (evenNum.size() == 1) {
            outlier = evenNum.get(0);
        } else if (oddNum.size() == 1){
            outlier = oddNum.get(0);
        }
        return outlier;

//        int current = 1, previous = 0, ans = 0;
//        for (int i = 1; i < s.length(); i++) {
//            if(s.charAt(i) == s.charAt(i-1)){
//                current++;
//            } else {
//                ans += Math.min(current, previous);
//                previous = current;
//                current = 1;
//            }
//        } return ans + Math.min(current, previous);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> tall = new ArrayList<>();
        if (buildings.length <1) return tall;

        if (direction.equals("EAST")) {
            for (int i = 0; i < buildings.length; i++) {
                int count = 0;
                for (int j = i+1; j < buildings.length; j++) {
                    if (buildings[i] > buildings[j]) {
                        count++;
                    }
                }
                if (count == buildings.length -i -1) {
                    tall.add(i);
                }
            }
        } else {
//            tall.add(0);
//            int lastInput = buildings[0];
//            for( int i = 1; i < buildings.length; i++ )
//            {
//                if( buildings[i] > buildings[i - 1] && buildings[i] > lastInput )
//                {
//                    tall.add(i);
//                    lastInput = buildings[i];
//                }
//            }
            for (int i = 0; i < buildings.length; i++) {
                int count = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (buildings[i] > buildings[j]) {
                        count++;
                    }
                }
                if (count == buildings.length -i -1) {
                    tall.add(i);
                }
            }

//            for (int i = buildings.length-1; i >= 0; i--) {
//                int count = 0;
//                for (int j = i-1; j >= 0; j--) {
//                    if (buildings[i] > buildings[j]) {
//                        count++;
//                    }
//                }
//                if (count == buildings.length -i -1) {
//                    tall.add(i);
//                }
//            }
        }

        return tall;
    }

    static class Program2 {
        public static void removeKthNodeFromEnd(LinkedList head, int k) {
            // Write your code here.
            int count = 1;
            LinkedList current = head;

            while (current.next != null) {
                current = current.next;
                count++;
            }
            int pointToRemove = count - k +1;
            int loop = 1;

            while (loop < pointToRemove) {
                current = current.next;
                loop++;
            }
            current.next = current.next.next;
        }

        static class LinkedList {
            int value;
            LinkedList next = null;

            public LinkedList(int value) {
                this.value = value;
            }
        }
    }

    static class Program3 {
        public static void removeKthNodeFromEnd(LinkedList head, int k) {

            LinkedList first = head;
            LinkedList second = head;
            int counter = 1;
            while (counter <= k) {
                second = second.next;
                counter ++;
            }
            if (second == null) {

                head.value = head.next.value;
                head.next = head.next.next;
                return;
            }
            while (second.next != null) {
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
        }



        static class LinkedList {
            int value;
            LinkedList next = null;



            public LinkedList(int value) {
                this.value = value;
            }
        }
    }

    static class Program1 {
        static class DoublyLinkedList {
            public Node head;
            public Node tail;

            public void setHead(Node node) {
                // Write your code here.
                if(head != null) {
                    head.prev = node;
                } else {
                    head = node;
                }
                head = node;
            }

            public void insertAfter(Node node, Node nodeToInsert) {
                // Write your code here.
                nodeToInsert.next = node.next;
                node.next = nodeToInsert;
                nodeToInsert.prev = node;

                if(nodeToInsert.next != null) {
                    nodeToInsert.next.prev = nodeToInsert;
                }
            }

            /**
             *
             */
            void append(int new_data)
            {
                /* 1. allocate node
                 * 2. put in the data */
                Node new_node = new Node(new_data);

                Node last = head; /* used in step 5*/
                /* 3. This new node is going to be the last node, so
                 * make next of it as NULL*/
                new_node.next = null;
                /* 4. If the Linked List is empty, then make the new
                 * node as head */
                if (head == null) {
                    new_node.prev = null;
                    head = new_node;
                    return;
                }
                /* 5. Else traverse till the last node */
                while (last.next != null)
                    last = last.next;
                /* 6. Change the next of last node */
                last.next = new_node;
                /* 7. Make last node as previous of new node */
                new_node.prev = last;
            }

            /**
             *
             * @param node
             */
            public void setTail(Node node) {
                // Write your code here.
                Node last = head;
                node.next = null;

                if (head == null) {
                    node.prev = null;
                    head = node;
                    return;
                } else {
                    while (last.next != null) {
                        last = last.next;
                    }
                    last.next = node;
                }
                node.prev = last;
            }

            public void insertBefore(Node node, Node nodeToInsert) {
                // Write your code here.
            }



            public void insertAtPosition(int position, Node nodeToInsert) {
                // Write your code here.
            }

            public void removeNodesWithValue(int value) {
                // Write your code here.
            }

            public void remove(Node node) {
                // Write your code here.
            }

            public boolean containsNodeWithValue(int value) {
                // Write your code here.
                return false;
            }
        }

        // Do not edit the class below.
        static class Node {
            public int value;
            public Node prev;
            public Node next;

            public Node(int value) {
                this.value = value;
            }
        }
    }

    public static String dna(String dna) {
        return dna.replace('T','A').replace('A','T')
                .replace('C','G').replace('G','C');

//        return dna.replace('T','X').replace('A','T').replace('X','A')
//                .replace('C','X').replace('G','C').replace('X','G');
    }

    public static int shiftedDiff(String first, String second) {
        if (first.length() != second.length()) return -1;
        return (second + second).indexOf(first);
    }

    public static class Node1 {

        int data;
        Node1 next = null;

        Node1(final int data) {
            this.data = data;
        }

        public Node1(int data, Node1 next) {
            this.data = data;
            this.next = next;
        }

        public static Node1 append(Node1 listA, Node1 listB) {

            return listA;
        }

        public Node1 head = null;
        public Node1 tail = null;

//        addAtEnd() will add a new node to the end of the list
    }

    public static class Node {
            private int data;
            private Node next;

    public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            public Node(int data) {
                this.data = data;
                this.next = null;
            }

            public int getData() {
                return data;
            }

            public Node getNext() {
                return next;
            }
        }

    public static String stringify(Node list) {
        StringBuilder sb = new StringBuilder();
        Node next = list;
        while(next!=null){
            sb.append(next.getData());
            sb.append(" -> ");
            next = next.getNext();
        }
        sb.append("null");
        return sb.toString();
    }

    static int[] arrayRotation(int[] arr, int num) {
        List<int[]> arrList = Arrays.asList(arr);
        arrList.stream().forEach(System.out::println);

//        int[] newArr = new int[arr.length];
//
//        for(int i = 0; i <= num; i++) {
//            for (int j = 0; j< arr.length-1; j++) {
//                newArr[0] = arr[arr.length-1];
//                newArr[j+1] = arr[j];
//            }
//            arrayRotation(newArr, num);
//        }
//        for(int el : newArr) System.out.println(el);
        return new int[]{};
    }

    static int[] method(int[] arr, int target) {

        return new int[]{0, 0};
    }

    static String triangleBuilder (int height) {
        String character = "";
        for (int i = 0; i < height; i++) {
            System.out.println(character+= "*");
        }
        return "";
    }

    public static int killKthBit(int n, int k) {
        String strBin = Integer.toBinaryString(n);
        return 0;
    }

    public static boolean isPower(int n) {

        for (int i = 2; i < 100; i++) {
            int result = i;
            for (int j = 1; j < 10; j++) {
                result *= i;
                if(result == n)
                    return true;
            }
        }

        return false;

//        int initVal = n;
//        ArrayList<Integer> factors = new ArrayList<Integer>();
//        int factor = 2;
//        while(n > 1) {
//            if(n % factor == 0) {
//                n /= factor;
//                if(factor != initVal) factors.add(factor);
//            }else {
//                factor++;
//            }
//        }
//        Hashtable<Integer, Integer> store = new Hashtable<Integer, Integer>();
//        for (int fac:factors) {
//            if(!store.containsKey(fac)) store.put(fac, 1);
//            else store.put(fac, store.get(fac) + 1);
//        }
//        var groupedFactors = store.values();
//        var minFactorCount = 999;
//        for(int fac: groupedFactors) {
//            minFactorCount = Math.min(fac, minFactorCount);
//        }
//        for(int fac: groupedFactors) {
//            if(fac % minFactorCount != 0) return false;
//        }
//        return true;
    }

    public static List mapTest() {
        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();
        inventory.put("Laptop", 14);
        inventory.put("Router", 3);
        inventory.put("Charger", 12);
        inventory.put("Headset", 11);
        inventory.put("Projector", 2);
//        System.out.println(Collections.unmodifiableMap(inventory));

        Map<String, Integer> sInventory = new TreeMap<>(inventory);
        System.out.println(sInventory);
        List<Map.Entry<String, Integer> > inventList = new ArrayList<Map.Entry<String, Integer> >(inventory.entrySet());

        Collections.sort(inventList, new Comparator<Map.Entry<String, Integer> >() {
            // Comparing two entries by value
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue()
                        - entry2.getValue();
            }

        });
        return inventList;
    }

    public static String integerToRoman(int num) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    /* QUESTION 4

    Given a sequence of numbers, find the largest pair sum in the sequence.

    For example

    [10, 14, 2, 23, 19] --> 42 (= 23 + 19)
    [99, 2, 2, 23, 19] --> 122 (= 99 + 23)
    Input sequence contains minimum two elements and every element is an integer.*/

    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        return (numbers[numbers.length-1] + numbers[numbers.length-2]);
    }

    public static String spinWords(String sentence) {
        String[] strArr = sentence.split(" ");
        String finAns = "";

        for(int i= 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
            if (strArr[i].length() >= 5) {
                StringBuilder sb=new StringBuilder(strArr[i]);
                sb.reverse();
                strArr[i] = String.valueOf(sb);
                System.out.println(strArr[i]);
            }
        }
        for (String el : strArr) {
            finAns+=el + " ";
        }
        return finAns;
    }

    public static boolean checkPrime(String s) {
        return s.length() == 1 || (s.concat(s).indexOf(s, 1) == s.length());
    }

    public static int makeConsecutive(int[] arr) {
        Arrays.sort(arr);
        int count = 0, diff;

        for (int i = arr.length-1; i > 0; i--) {
            diff = arr[i] - arr[i-1];
            if (diff >1) {
                count += (diff -1);
            }
        }
        return count;
    }

    public static int[] replaceMiddle(int[] arr) {
        if (arr.length%2 == 0) {
            int midPos, init =0;

            int[] newArr = new int[arr.length -1];
            midPos = arr[(arr.length/2)] + arr[((arr.length/2) -1)];

            for (int i =0; i < (arr.length/2)-1; i++) {
                newArr[init] = arr[i];
                init++;
            }
            newArr[init] = midPos;
            init++;

            for (int i = (arr.length/2)+1; i < arr.length; i++) {
                newArr[init] = arr[i];
                init++;
            }
            return newArr;
        }
        return arr;
    }

    public static boolean isSmooth(int[] arr) {
        int midPos;
        if (arr.length %2 > 0) {
            midPos = arr[(int) Math.ceil(arr.length / 2)];
        } else {
            midPos = arr[(arr.length/2)] + arr[((arr.length/2) -1)];
        }

        if((arr[0] == arr[arr.length-1]) && (arr[0] == midPos)) {
            return true;
        }
        return false;
    }

    public static int[] splitArray(int[] arr, int l, int r) {
//        return Arrays.copyOfRange(arr, l, r);
        int init = 0;
        int[] newArr = new int[arr.length - (r -l)-1];
        for (int i = 0; i < l; i++) {
            newArr[init] = arr[i];
            init++;
        }

        for (int i = r+1; i < arr.length; i++) {
            newArr[init] = arr[i];
            init++;
        }
        return newArr;
    }

    public static int[] arrayJoin(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        int init = 0;

        for (int i = 0; i < a.length; i++) {
            newArr[init] = a[i];
            init++;
        }

        for (int i = 0; i < b.length; i++) {
            newArr[init] = b[i];
            init++;
        }
        return newArr;
    }

    public static int[] firstReverse(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length-1];
        System.out.println("Switch time!");

        arr[0] = last;
        arr[arr.length-1] = first;

        return arr;
    }

    public static int[] createArray(int size) {
        int[] finArr = new int[size];
        Arrays.fill(finArr, 1);
        return finArr;
    }

    public static int[] replaceArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 3;
            } else {
                arr[i] = arr[i];
            }
        }
        return arr;
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

    }
}