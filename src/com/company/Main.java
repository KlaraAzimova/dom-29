package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(List.of(98, 74, 56, 32, 14, 52, 36, 78, 96,9632,8521,7654));
        arrayList1.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);
    }
}
