package ru.autoqa.Java2021.sandbox;

public class Point {
    public double x;
    public double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance (Point target){
        double side1, side2;
        side1 = target.x - this.x;
        side2 = target.y - this.y;
        return Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
    }
    public String coordinates(){
        return "(x: " + this.x + ", y: " + this.y + ")";
    }

}
