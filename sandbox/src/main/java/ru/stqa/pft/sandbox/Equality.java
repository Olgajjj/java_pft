package ru.stqa.pft.sandbox;

public class Equality {

    public static void main(String[] args) {
        String s1 = "firefox";
        String s2 = "Firefox";

        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
