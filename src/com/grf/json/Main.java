package com.grf.json;


import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.setId(1);
            person.setName("ali");
            System.out.println(person.toJson());

            Person person2 = new Person();
            person2.setId(2);
            person2.setName("hasan");
            System.out.println(person2.toJson());

            JSONArray jsonArray = new JSONArray();
            jsonArray.put(person.toJson());
            jsonArray.put(person2.toJson());
            System.out.println(jsonArray);


            JSONObject test = new JSONObject();
            test.put("id", 223334);
            test.put("name", "salam");
            test.put("persons", jsonArray);
            System.out.println(test);

        } catch (Exception e) {

        }

    }
}
