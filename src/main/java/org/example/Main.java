package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] wordArr = {"Стол", "Стул", "Стол", "Стул", "Телефон", "Такса", "Кот", "Собака", "Банан", "Такса", "Стол", "Стул", "Стул"};
        HashMap<String, Integer> wordList = new HashMap<>();

        for (String a : wordArr) {
            wordList.put(a, wordList.getOrDefault(a, 0) + 1);
        }

        System.out.println(wordList.entrySet());


        System.out.println("--------------------");

        Dict dict = new Dict();
        dict.add("Помидор", "Это овощ");
        dict.add("Помидор", "Это фрукт");
        dict.add("Помидор", "Это овощ");
        dict.add("Помидор", "a");
        dict.add("Бобер", "плотина-логи");
        dict.add("Бобер", "685865865865");
        dict.add("Апельсин", "Это не овощ");

        dict.getAll();
    }
}