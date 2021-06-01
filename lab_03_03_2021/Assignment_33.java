/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03_03_2021;

/**
 *
 * @author gauri
 */
class Shape{
    int width;
    int height;
    Shape(){
        width = 10;
        height = 20;
    }
}
class Rectangle extends Shape{
    int length;
    Rectangle(){
        length = 30;
    }
    public int area(){
        return length * width;
    }
}
class Triangle extends Rectangle{
     int base;
     Triangle(){
         base = 40;
     }
     public int area(){
        return (height * base) / 2;
     }
}

public class Assignment_33 {
    public static void main(String args[]){
        Rectangle R = new Rectangle();
        Triangle T = new Triangle();

        System.out.println("Area of Rectangle "+R.area());
        System.out.println("Area of Triangle "+T.area());
    }
}