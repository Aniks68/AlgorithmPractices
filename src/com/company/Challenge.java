package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {
    public static int arrayPacking(ArrayList<Integer> integers) {
        int[] binArr = new int[integers.size()];
        String numCompact = "";
        int numCompacted;
        int finalAns;

        for(int i = 0; i < binArr.length; i++) {
            binArr[i] = Integer.parseInt(String.format("%08d", (Integer.toBinaryString(integers.get(i)))));
        }


        for( int i = binArr.length - 1; i >= 0; i--) {
            numCompact += binArr[i];
        }
        numCompacted = Integer.parseInt(numCompact);

        finalAns = Integer.parseInt(""+numCompacted+"",2);


        return finalAns;
    }
}