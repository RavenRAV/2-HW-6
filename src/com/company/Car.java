package com.company;

public class Car implements Comparable<Car> {
    private String model;
    private long year;
    private double volume;

    public Car(String model, long year, double volume){
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    @Override
    public int compareTo(Car o) {
        return Long.compare(this.getYear(), o.getYear());
    }

    public String getModel() {
        return model;
    }

    public long getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }
}
