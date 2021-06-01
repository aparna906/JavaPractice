/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_15_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_19 {
    public static void main(String args[]){
      int n, max, min, i;
        int a[] = new int[100];
   
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        n = scan.nextInt();
        System.out.println("Enter elements");
         
        for(i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
   
        max = min = a[0];
         
        for(i = 1; i < n; i++) {
            if(a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
                
        }
        
        System.out.println("Maximum Number : " + max);
        System.out.println("Mimimum Number : " + min);
    }         
  }

