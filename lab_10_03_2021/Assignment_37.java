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

class Animal {
  Animal() {
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {
  Dog() {
    super();

    System.out.println("I am a dog");
  }
}
public class Assignment_37 {
    public static void main(String[] args) {
    Dog dog1 = new Dog();
}
}