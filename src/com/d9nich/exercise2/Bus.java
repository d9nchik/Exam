package com.d9nich.exercise2;

import java.util.*;

public class Bus {
    private static int numberInPark = 1;
    private final int number;
    private final String mark;
    private final int yearOfStartUsage;
    private int mileage;

    public Bus(int number, String mark, int yearOfStartUsage, int mileage) {
        this.number = number;
        this.mark = mark;
        this.yearOfStartUsage = yearOfStartUsage;
        this.mileage = mileage;
    }

    public Bus(String mark) {
        this.mark = mark;
        number = numberInPark++;
        yearOfStartUsage = new GregorianCalendar().get(Calendar.YEAR);
        mileage = 0;
    }

    public Bus(String mark, int yearOfStartUsage, int mileage) {
        number = numberInPark++;
        this.mark = mark;
        this.yearOfStartUsage = yearOfStartUsage;
        this.mileage = mileage;
    }

    public int getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    public int getYearOfStartUsage() {
        return yearOfStartUsage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public static int getNumberInPark() {
        return numberInPark;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number=" + number +
                ", mark='" + mark + '\'' +
                ", yearOfStartUsage=" + yearOfStartUsage +
                ", mileage=" + mileage +
                '}';
    }

    public static Set<Bus> getBusPark(int number) {
        Set<Bus> buses = new HashSet<>();
        for (int i = 0; i < number; i++) {
            buses.add(generateBus());
        }
        return buses;
    }

    public static Bus generateBus() {
        String[] models = {"Opel", "Lada", "BMW", "Toyota", "Tesla", "VolksWagen"};
        Random random = new Random();
        return new Bus(models[random.nextInt(models.length)], random.nextInt(40) + 1980,
                random.nextInt(10_000));
    }
}
