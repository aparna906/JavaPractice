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
public class Assignment_5 {
        public static void main(String[] args) {
   int i,n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        n= scan.nextInt();
        for(i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("sum of natural no is :" + sum);
    }

}
