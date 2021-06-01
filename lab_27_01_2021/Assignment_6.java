/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_27_01_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_6 {
    public static void main(String[] args) {
        int i, n,fact=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        n= scan.nextInt();
        for(i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of n no is :" + fact);
    }
}
