package org.example;

import java.util.*;

public class Dict {
    private TreeMap<String, TreeSet<String>> dictionary;

    public Dict() {
        this.dictionary = new TreeMap<>();
    }

    void add(String word, String definition) {

        if (dictionary.containsKey(word)) {
            TreeSet<String> definitions = dictionary.get(word);


            if (definitions.contains(definition)) {
                System.out.println("Предупреждение: У слова '" + word + "' повторяющееся определение: " + definition);
            } else {
                definitions.add(definition);
            }
        } else {

            TreeSet<String> definitions = new TreeSet<>();
            definitions.add(definition);
            dictionary.put(word, definitions);
        }
    }
    public void get(String word){
        if(this.dictionary.containsKey(word)){
            System.out.println(this.dictionary.get(word).toString());
        }
    }

    public void getAll(){
        for(var pair : dictionary.entrySet()){
            String word = pair.getKey();
            TreeSet<String> defenitions = pair.getValue();
            System.out.println(word + ": " + defenitions);
        }
    }
}
