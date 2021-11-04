package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityDemo {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
            pq.add("Hokage");
            pq.add("Raikage");
            pq.add("Kazekage");

        System.out.println(pq);
//        pq.remove("Raikage");
//        System.out.println("After remove - " + pq);
//        System.out.println("Poll Method - " + pq.poll());
//        System.out.println("After Poll - " + pq);
//        pq.clear();

        System.out.println("After clear call - " + pq);

        String element = pq.peek();
        System.out.println("Accessed Element: " + element);

        Iterator<String> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
