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
class ParentClass{
    //Parent class constructor
   ParentClass(){
	System.out.println("Constructor of Parent");
   }
}
class Assignment_38 extends ParentClass{
   Assignment_38(){
	System.out.println("Constructor of Child");
   }
   public static void main(String args[]){
	new Assignment_38();
   }
}