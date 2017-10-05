package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        /*String[] langs = new String[4];
        langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Phyton";
        langs[3] = "PHP";*/
        String[] langs = {"мясо", "жареное", "вкусное", "!"};

        /*for (int i=0; i<langs.length; i++) { -- как обычный цикл
            System.out.println("Я хочу ... " + langs[i]);
        }*/

        /* for (String l : langs) { -- массив рассматривается как коллекция
            System.out.println("Я хочу ... " + l);
        }*/

        //Коллекции
        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("PHP");
        //Размер списка меняется динамически
        for (String l : langs) {
            System.out.println("I want to learn " + l);
        }

        List<String> languages1 = Arrays.asList("Java", "C#", "Python", "PHP");
        for (int i=0; i<languages1.size(); i++) {
            System.out.println("I want to learn " + languages1.get(i));
        }

    }
}
