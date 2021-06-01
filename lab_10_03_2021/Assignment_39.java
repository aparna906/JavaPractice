/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10_03_2021;

/**
 *
 * @author gauri
 */

interface Shape{
    public double area();
}
class Circle implements Shape{
    double radius;
    public Circle(double r){
        radius = r;
    }
    public double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle implements Shape{
    double length;
    double breadth;
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public double area(){
        return length * breadth;
    }
}
class Assignment_39{
    public static void main(String args[]){
        Circle c = new Circle(2.5);
        System.out.println("Area of circle: " + c.area());
        Rectangle r = new Rectangle(5.0, 2.5);
        System.out.println("Area of rectangle: " + r.area());
    }
}
