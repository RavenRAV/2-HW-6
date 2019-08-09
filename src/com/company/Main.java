package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 2016, 1.5));
        cars.add(new Car("Car2", 2017, 2.0));
        cars.add(new Car("Car3", 2010, 1.4));
        cars.add(new Car("Car4", 2009, 1.7));
        cars.add(new Car("Car5", 2011, 2.1));
        cars.add(new Car("Car6", 2018, 3.0));
        cars.add(new Car("Car7", 2012, 2.5));
        cars.add(new Car("Car8", 2014, 2.1));
        cars.add(new Car("Car9", 2013, 2.5));
        cars.add(new Car("Car10", 2015, 1.5));

        System.out.println("Before");
        for (Car o : cars) {
            System.out.println(o.getModel() + " " + o.getYear() + " " + o.getVolume());
        }
        Collections.sort(cars);

        System.out.println("After");
        for (Car o : cars) {
            System.out.println(o.getModel() + " " + o.getYear() + " " + o.getVolume());
        }

        Collections.reverse(cars);

        System.out.println("After after");
        for (Car o : cars) {
            System.out.println(o.getModel() + " " + o.getYear() + " " + o.getVolume());
        }



    }
}
