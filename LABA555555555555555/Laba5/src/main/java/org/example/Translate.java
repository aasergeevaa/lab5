package org.example;

import java.util.*;

public class Translate {
    private Map<String, LinkedHashSet<String>> translator = new TreeMap<>();;

    public void add (String term, String translate){
        LinkedHashSet<String> pars = translator.getOrDefault(term, new LinkedHashSet<>());
        for(String key : translator.keySet()){
            LinkedHashSet<String> translations = translator.get(key);
            if(translations.contains(translate)){
                System.out.println("Перевод " + translate + " уже есть у слова " + key);
                return;
            }
        }

        pars.add(translate);
        translator.put(term, pars);
    }
    public void get(String term) {
        System.out.println(term + " Перевод: " + translator.get(term));
    }

    public void printAll() {
        for (Map.Entry<String, LinkedHashSet<String>> a : translator.entrySet()){
            System.out.println(a);
        }
    }
}
