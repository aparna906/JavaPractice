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
class Animal{  
    
void eat(){
    System.out.println("eating...");
}  
}  
class Dog extends Animal{  
void bark(){
    System.out.println("barking...");
}  
}  
class BabyDog extends Dog{  
void weep(){
    System.out.println("weeping...");
}  
}  
public class Assignment_35 {
    public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.weep();  
    d.bark();  
    d.eat();  
}
}
