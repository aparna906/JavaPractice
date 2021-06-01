/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_25_01_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_2 {
    public static void main(String[] args) {
   // write your code here
        int a,b,temp=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values a and b");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("swap before two no");
        System.out.println(a);
        System.out.println(b);

        System.out.println("swap after two no");
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}


    

