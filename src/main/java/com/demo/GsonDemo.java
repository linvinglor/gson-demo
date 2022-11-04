package com.demo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import java.util.*;
public class GsonDemo {
    public static void main(String[] args) {
        System.out.println("hello!!! start gson!!");
        System.out.println();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //------------obj------------------
        // javaBean => json
        Person person = new Person("张三","pass123",500);
        String personJson = gson.toJson(person);
        System.out.println("javaBean => json ====" + personJson);
        System.out.println();

        // json => javaBean
        person = gson.fromJson(personJson,Person.class);
        System.out.println("json => javaBean ====" + person.getUsername()+"--"+person.getPassword()+"--"+person.getMoney());
        System.out.println();

        // -----------------obj array-------------
        // list=>json
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person);
        Person person2 = new Person("李四","pass111", 3000);
        personList.add(person2);
        String personListJson = gson.toJson(personList);
        System.out.println( "list => json ====" + personListJson);
        System.out.println();

        // json =>list
        List<Person> pl = gson.fromJson(personListJson,new TypeToken<List<Person>>() {}.getType());
        for (Person p : pl) {
            System.out.println( "json => list ====" + p.getUsername()+"--"+p.getPassword()+"--"+p.getMoney());
            System.out.println();
        }

        // ------------------HashMap-----------------
        // map=>json
        Map<String, Person> map = new HashMap<String, Person>();
        map.put("p1", person);
        map.put("p2", person2);
        String gsonMapJson = gson.toJson(map);
        System.out.println( "map => json ====" + gsonMapJson);
        System.out.println();

        // json=>map
        Map<String, Person> m = gson.fromJson(gsonMapJson,new TypeToken<Map<String, Person>>() {}.getType());
        Set<String> keys = m.keySet();
        for(String key:keys){
            System.out.println( "json => map ====" + m.get(key).getUsername()+"--"+m.get(key).getPassword()+"--"+m.get(key).getMoney());
            System.out.println();
        }
    }
}