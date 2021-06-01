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
public class Assignment_10 {
    public static void main(String[]args){
       int n,r=0;
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the value of n");
       n=scan.nextInt();
       while (n != 0)
  {
    r = r * 10;
    r = r + n%10;
    n = n/10;
  }
    System.out.println("Reverse no are : " +r);
       
    }
}
