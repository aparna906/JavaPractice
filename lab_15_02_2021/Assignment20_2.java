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
public class Assignment20_2 {
    public static void main(String args[]){
      int n,a[];
           Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n = input.nextInt(); 
      a = new int[n];

      System.out.println("Enter all the elements ");
      for (int i= 0; i <n; i++)
          a[i] = input.nextInt();
       
      int size = a.length;

      for (int i = 0 ;i<= size-1; i++){
         int min = i;

         for (int j = i+1; j<size; j++){
            if (a[j] < a[min]){
            min = j;
            }
         }
         int temp = a[min];
         a[min] = a[i];
         a[i] = temp;
      }

      for (int i = 0 ; i< size; i++){
         System.out.print(" "  + a[i]);
      }
   }  

}
