/* Vishaun Jones
 *  03=31=2022
 *  Assignment 5: Shape
 *  CGS3416
 *  Silei Song*/

import java.lang.Math;
interface shapes { //Interface that includes the PI and double method.
    double PI = 3.14; //PI is automatically final since it is in an interface

    double area();
}

abstract class polygon implements shapes{
    public int edges;

    public int getEdges() {
        return edges;
    }

    public abstract double perimeter();
}

class triangle extends polygon implements shapes{
    private double base;
    private double height;

    public triangle(double b, double h){
        base = b;
        height = h;
        edges = 3;
    }
    public double perimeter() {
        return (base + height + Math.sqrt((base * base)+ (height * height)));
    }

    public double area() {
        return ((base * height)/2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }
}

class rectangle extends polygon implements shapes {
    private double length;
    private double width;

    public rectangle(double l, double w) {
        length = l;
        width = w;
        super.edges = 4;
    }

    public double perimeter() {
        return (2*(length + width));
    }

    public double area() {
        return (width * length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

}
class circle implements shapes{
    private double radius;

    public circle(double r) {
        radius = r;
    }

    public double area() {
        return (PI * Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }
}


public class Shape {
    public static void main(String[] args){
        shapes[] sample = new shapes[5];
        sample[0] = new circle(5);
        sample[1] = new triangle(3, 4);
        sample[2] = new rectangle(10, 3);
        sample[3] = new circle(3.5);
        sample[4] = new triangle(7.5, 5);
        for(int i = 0; i < 5; i++){
            if(sample[i] instanceof circle)
                System.out.println("This is a circle. It's area is " + sample[i].area());
            else{
                System.out.println("This is a polygon with " + ((polygon)sample[i]).getEdges() + " edges.");
                System.out.println("It's perimeter is " + ((polygon)sample[i]).perimeter() + ". It's area is " + sample[i].area());
            }
        }
    }
}

