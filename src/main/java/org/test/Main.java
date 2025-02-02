package org.test;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] mass = new String[]{"Nelly", "Aslan", "Vera", "Vera", "Nelly", "Vasya", "cat", "dog", "cat", "home",
            "father", "mother", "sister", "sister", "friend", "boyfriend", "note", "computer", "book", "book"};
        List<String> unqiueList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : mass) {
            if (map.get(s) != null) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unqiueList.add(entry.getKey());
            }
            System.out.println("слово " + entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
        System.out.println("уникальные значения " + unqiueList);
    }

}