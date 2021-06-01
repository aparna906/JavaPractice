/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_27_01_2021;

import static java.lang.Double.sum;
import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_9 {
    public static void main(String[]args){
        int n,m;
        int sum = 0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = scan.nextInt();
        while(n>0){
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
       System.out.println("sum of digits : " + sum);
  }
}
