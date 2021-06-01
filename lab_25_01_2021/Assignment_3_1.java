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
public class Assignment_3_1 {
        public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values a and b");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.print("manimum value is : ");
        System.out.print(Math.min(a,b));
    }

}
