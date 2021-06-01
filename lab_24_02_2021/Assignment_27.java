/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_24_02_2021;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author gauri
 */
class Float1{
    float f;
    Float1(float f){
        this.f = f;
    }
}
public class Assignment_27 {
    public static void main(String args[]){
        Float1 f1 = new Float1(10.5f);
        Float1 f2 = new Float1(20.5f);

        System.out.println("Addition of Two Objects "+ (f1.f+f2.f));    
        System.out.println("Substraction of Two Objects "+ (f1.f-f2.f));   
        System.out.println("Multiplication of Two Objects "+ (f1.f*f2.f));    
       }   
}