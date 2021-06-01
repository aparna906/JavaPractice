/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_14 {
    public static void main(String[]args){
        String n;
        Scanner scan =new Scanner(System.in);
        System.out.println("String is  : ");
        String input=scan.nextLine();
       
        System.out.println("Your string is :");
        System.out.println(input); 
       
        String strCopy = input;
        System.out.println("copy string : " );
               
        System.out.println(strCopy); 
    }
    
}
