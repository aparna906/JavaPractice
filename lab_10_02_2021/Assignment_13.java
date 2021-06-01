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
public class Assignment_13 {
    public static void main(String args[]){
        int i,j,n;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the value of n : ");
        n=scan.nextInt();
        System.out.println("Prime no series are : ");
        for(i=2;i<=n;i++)
    {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
           System.out.println(i);
        }
    }
     
    }
    
}
