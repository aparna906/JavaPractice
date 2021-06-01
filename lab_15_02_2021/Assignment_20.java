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
public class Assignment_20 {
    public static void main(String args[])
 {
  int n,a[];
         Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n = input.nextInt(); 
      a = new int[n];

      System.out.println("Enter all the elements ");
      for (int i= 0; i < n; i++)
          a[i] = input.nextInt();
         
      bubbleSort(a);
 
 }
 
 public static int[] bubbleSort(int arr[])
 {
  for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr.length-1-i; j++) { 
     if(arr[j]>arr[j+1])
     {
       int temp=arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
     }
   }
   System.out.print("Iteration "+(i+1)+": ");
   printArray(arr);
  }
  return arr;
 }
 
 public static void printArray(int arr[])
 {
  for (int i = 0; i <arr.length; i++) {
   System.out.print(arr[i]+" ");
  }
  System.out.println();
 }
}

