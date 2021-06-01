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
public class Assignment_18 {
    public static void main(String args[])
   {
      int i, num, s, a[], first, last, middle;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt(); 
      a = new int[num];

      System.out.println("Enter all the elements ");
      for ( i= 0; i < num; i++)
          a[i] = input.nextInt();

      System.out.println("Enter the search element:");
      s = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( a[middle] < s )
           first = middle + 1;
         else if ( a[middle] == s)
         {
           System.out.println("Location of the element : " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println("Wrong input");
   }
}
