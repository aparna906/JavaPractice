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
public class Assignment_8 {
    public static void main(String[] args) {

        int n,r,sum=0,temp;
           Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        n = scan.nextInt();
        temp = n;
        while (n>0)
        {
            r = n%10;
            sum = sum + r*r*r;
            n=n/10;
        }

        if(temp == sum)
            System.out.println( " Armstrong number");
        else
            System.out.println(" Number is not an Armstrong number");
    }
}
