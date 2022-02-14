package com.grf.db;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.grf.db.Person");
            Method[] methods = clazz.getDeclaredMethods();
            Object o = clazz.newInstance();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            System.out.println("======= call method ===========");
            Method method = clazz.getDeclaredMethod("sayHello");
            method.setAccessible(true);
            method.invoke(o);

            Method method1 = clazz.getDeclaredMethod("sum", int.class, int.class);
            method1.setAccessible(true);
            int sum = (int) method1.invoke(o, 2, 6);
            System.out.println("sum :" + sum);

            System.out.println("======= properties ===========");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
