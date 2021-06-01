/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05_03_2021;

/**
 *
 * @author gauri
 */

abstract class Figure {
double dim1;
double dim2;
Figure(double a, double b) {
dim1 = a; dim2 = b;
}
abstract double area();
}

class Triangle extends Figure {
Triangle(double a, double b) {
super(a, b);
}
double area() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}

class Rectangle extends Figure {
Rectangle(double a, double b) {
super(a, b);
}
double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Assignment_34 {
public static void main(String args[]) {
Triangle t = new Triangle(10, 8);
Rectangle r = new Rectangle(9, 5);
Figure figref;
figref = t; System.out.println(figref.area());
figref = r; System.out.println(figref.area());
}
}