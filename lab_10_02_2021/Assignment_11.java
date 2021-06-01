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
public class Assignment_11 {
    public static void main(String args[]){
        int n,r,sum = 0,temp;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=scan.nextInt();
        temp=n;
        while(n>0){
           r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
        {
            System.out.println("number is palindrome" );
        }
        else
         System.out.println("no is not palindrome");
        }
        
       
    }

