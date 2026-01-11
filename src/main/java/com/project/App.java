package com.project;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        String input = null;

        if (args.length > 0 && args[0] == "test") {
            System.out.println("Wykryte przez SpotBugs");
        }

        if (input == null) {
            System.out.println("Zmienna jest nullem");
        }
        System.out.println(input.length());
    }

    public void printMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    public void cleanText(String text) {
        text.trim();
        text.replace("bad", "good");
        System.out.println(text);
    }
}