package com.company;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You're sitting in front of your computer learning Java"));
        locations.put(1, new Location(1, "You're standing in front of the Wandenreich"));
        locations.put(2, new Location(2, "You're in in Hueco Mundo surrounded by hollows"));
        locations.put(3, new Location(3, "You're on top of the mansion overlooking Las Noches"));
        locations.put(4, new Location(4, "You're at the Soul King Palace facing off against Quincy invaders"));
        locations.put(5, new Location(5, "You're defending against Aizen and his arrancars"));

        int loc = 1;
//        while(true) {
//            System.out.println(locations.get(loc).getDescription());
//            if (loc == 0) {
//                break;
//            }
//
//            loc = scanner.nextInt();
//            if (!locations.containsKey(loc)) {
//                System.out.println("You cannot go in that direction");
//            }
//
//
//        }

        List<Integer> numArr = new ArrayList<>();
        numArr.add(24);
        numArr.add(85);
        numArr.add(0);

//        System.out.println(arrayPacking((ArrayList<Integer>) numArr));

    }

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
