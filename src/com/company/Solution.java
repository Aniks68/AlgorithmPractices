package com.company;
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
        int[] exampleTest1 = new int[]{Integer.MAX_VALUE, 0, 1};
        System.out.println(find(exampleTest1));

        System.out.println(countBinarySubstrings("00110"));

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