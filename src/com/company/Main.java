package com.company;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<Integer>(List.of(98, 74, 56, 32, 14, 52, 36, 78, 96));
        arrayList1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        arrayList1.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}
