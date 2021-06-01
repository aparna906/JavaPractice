/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_17_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_22 {
public static void main(String[]args){ 
    
    int a[][]={{1,3},{2,4}};    
        int b[][]={{1,3},{1,2}};    
         int c[][]=new int[2][2];    
         int d[][]=new int[2][2];
         int e[][]=new int[2][2];
         int f[][]=new int[2][2];
         int n = 0;
         Scanner scan=new Scanner(System.in);
        
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division ");
        System.out.println("Please enter your choice");
        n=scan.nextInt();
       switch(n)
       {    
        case 1:
           System.out.println("add :");
           for(int i=0;i<2;i++){    
           for(int j=0;j<2;j++){   
           c[i][j]=a[i][j]+b[i][j];  
           System.out.print(c[i][j]+" ");
       }
          System.out.println();
       } 
        break;
       
       case 2 :
          System.out.println("subtraction :");
          for(int i=0;i<2;i++){    
          for(int j=0;j<2;j++){   
          d[i][j]=a[i][j]-b[i][j];  
          System.out.print(d[i][j]+" ");
       }
          System.out.println();
       }  
        break;
        
         case 3 :
          System.out.println("multiplication :");
          for(int i=0;i<2;i++){    
          for(int j=0;j<2;j++){   
          e[i][j]=a[i][j]*b[i][j];  
          System.out.print(e[i][j]+" ");
       }
          System.out.println();
       }   
        break;
        
         case 4 :
          System.out.println("divide :");
          for(int i=0;i<2;i++){    
          for(int j=0;j<2;j++){   
          f[i][j]=a[i][j]*b[i][j];  
          System.out.print(f[i][j]+" ");
          
       }
          System.out.println();
       }   
       break;   
          
     default:
      System.out.println("Please Enter Valid Option");
      
       }
       }
}




    

