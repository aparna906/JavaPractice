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
public class Assignment_40 {
    public static void main(String[] args) 
    { 
        try { 
            int number[] = new int[10]; 
            number[10] = 30 / 0; 
        } 
        catch (ArithmeticException e) { 
            System.out.println( 
                "Zero cannot divide any number"); 
        } 
        catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println( 
                "Index out of size of the array"); 
        } 
    } 
}
