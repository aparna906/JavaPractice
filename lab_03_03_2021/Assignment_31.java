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

class Overloading{
    
    public void area(double radius){
        System.out.println(Math.PI * radius * radius);
    }
    public void area(int length, int width){
        System.out.println(length * width);
    }
    public void area(double denominator, int base, double height){
        System.out.println(denominator * base * height);
    }
}
public class Assignment_31 {
   public static void main(String args[]){
        Overloading O = new Overloading();
        O.area(10.5);
        O.area(5, 5);
        O.area(0.5, 10, 20);
    } 
}
