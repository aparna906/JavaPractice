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
public class Assignment_4_1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values of a b and c ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if ((a<b && a<c)) {
            System.out.println("A is minimun no ");
        } else if ((b<a && b<c)) {
            System.out.println("B is minimum no");
        } else {
            System.out.println("C is minimum no");
        }
    }
}