package com.company.biometric;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Snapshot {
    private ArrayList<Integer> data;
    private ArrayList<Integer> dataOriginal;

    public Snapshot(ArrayList<Integer> data) {
        this.data = data;
        this.dataOriginal = (ArrayList<Integer>) new ArrayList<>(data);

    }

    public ArrayList<Integer> restore() {
        return new ArrayList<>(dataOriginal);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Snapshot snap = new Snapshot(list);
        System.out.println(snap.restore());
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
    }
}