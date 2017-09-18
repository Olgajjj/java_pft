package ru.stqa.pft.sandbox;

public class Point {
    int x, y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    //вычисляем расстояние от текущей точки до переданной
    public double calcDistance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y, 2));
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
