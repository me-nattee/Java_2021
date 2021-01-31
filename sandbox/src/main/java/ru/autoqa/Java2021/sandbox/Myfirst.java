package ru.autoqa.Java2021.sandbox;

public class Myfirst {

    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(2,2);

        System.out.println("Расстояния между точками " + p1.coordinates() + " и " + p2.coordinates() + " = " + p1.distance(p2));

    }

}