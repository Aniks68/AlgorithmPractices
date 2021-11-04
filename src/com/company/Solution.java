package com.company;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(createArray(3)));
       int[] arr = new int[]{1, 2,3,4, 5};
       int[] barr = new int[]{7, 7, 3, 8, 5, 7, 3, 8, 2, 9, 7};
       int[] stats = new int[]{6,2, 3, 16, 12, 14, 8};

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


//        System.out.println("The unsorted list is: " + javaGuys);
//        System.out.println("==============================================");
//        Collections.sort(javaGuys);
//        System.out.println("The sorted list is: "+ javaGuys);
//        Collections.reverse(javaGuys);
//        System.out.println("==============================================");
//        System.out.println("The reverse order sorted list is: " + javaGuys);

//        System.out.println(mapTest());


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