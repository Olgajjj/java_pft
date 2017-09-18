package ru.stqa.pft.sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class MyFirstProgram {

public static void main(String[] args) {	
    System.out.println("Введите координаты первой точки:");
    int x,y;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String ab = null;
    try {
        ab = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    x = Integer.parseInt(ab);
    String or = null;
    try {
        or = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    y = Integer.parseInt(or);
    Point pointA = new Point();
    pointA.x = x;
    pointA.y = y;
    System.out.println("Введите координаты второй точки:");
    try {
        ab = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    x = Integer.parseInt(ab);
    try {
        or = reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    y = Integer.parseInt(or);
    Point pointB = new Point();
    pointB.x = x;
    pointB.y = y;
    System.out.println("Расстояние между точками "+pointA+" и "+pointB+" равно");
    System.out.print("Вычисление через функцию: ");
    System.out.format("%.3f%n", distance(pointA, pointB));
    System.out.print("Вычисление через метод класса: ");
    System.out.format("%.3f%n", pointA.calcDistance(pointB));
    //расстояние от себя до себя
    System.out.print("от А до А ");
    System.out.format("%.3f%n", pointA.calcDistance(pointA));
}

public static double distance(Point p1, Point p2){
    double c;
    c=Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    return c;
}

}