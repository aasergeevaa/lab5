package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String[] wordArr = {"такса", "жизнь", "работа", "такса", "слово", "такса", "котёночек", "слово", "такса", "такса", "отмена", "поезд", "вокзал"};
        HashMap<String, Integer> wordList = new HashMap<String, Integer>();

        for (String a : wordArr) {
            wordList.put(a, wordList.getOrDefault(a, 0) + 1);
        }

        System.out.println(wordList.entrySet());

        System.out.println("Задание 2");
        Translate translate = new Translate();
        translate.add("run","запустить программу");
        translate.add("set","установить");
        translate.add("set","набор, очередность");
        translate.add("blue","синий");
        translate.add("blue","грустный");
        translate.add("stand","стоять");
        translate.add("stand","терпеть");
        translate.add("date","дата");
        translate.add("date","романтическое свидание");
        translate.add("nails","ногти на руках, ногах");
        translate.add("nails","гвозди");
        translate.add("transparent","очевидный");
        translate.add("transparent","невидимый");
        translate.add("leave","оставаться");
        translate.add("leave","покидать что-либо");
        translate.add("run","покидать что-либо");

        translate.printAll();

    }


}