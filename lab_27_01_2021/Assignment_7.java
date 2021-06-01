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
public class Assignment_7 {
    public static void main(String[] args) {
        int n,i,m,f= 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n ");
        n = scan.nextInt();
        m=n/2;
        for(i=2 ; i<=m ; i++){
        if (n%i == 0) {
            System.out.println("Number is not prime" );
            f = 1;
            break;
        }
        }
       if(f==0){
           System.out.println("Number is a prime");
       }
    }
}
