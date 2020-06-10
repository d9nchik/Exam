package com.d9nich.exercise2;

import java.util.Comparator;
import java.util.TreeSet;

public class Starter {
    public static void main(String[] args) {
        TreeSet<Bus> buses = new TreeSet<>(Comparator.comparing(Bus::getYearOfStartUsage).reversed());
        buses.addAll(Bus.getBusPark(10));
        buses.forEach(System.out::println);
    }
}
