package com.grf.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HMap {
    public static void main(String[] args) {
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("pars", 1200);
        cars.put("206", 1100);
        cars.put("pride", 950);

        for (String key : cars.keySet()) {
            System.out.print(key);
            System.out.print(" : ");
            System.out.println(cars.get(key));
        }

        System.out.println("------------------------");
        Iterator<String> keys = cars.keySet().iterator();
        while (keys.hasNext())
        {
            String key =  keys.next();
            System.out.println(cars.get(key));
        }

    }
}
