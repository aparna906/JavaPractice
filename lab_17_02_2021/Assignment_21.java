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
public class Assignment_21 {
    public static void main(String args[])
    {
        int a[][]={{1,3},{2,4}};    
        int b[][]={{1,3},{1,2}};    
         int c[][]=new int[2][2];    
         int d[][]=new int[2][2];
         int e[][]=new int[2][2];
         int f[][]=new int[2][2];
        
//adding and printing addition of 2 matrices
System.out.println("add :");
       for(int i=0;i<2;i++){    
       for(int j=0;j<2;j++){   
       
       c[i][j]=a[i][j]+b[i][j];  
       System.out.print(c[i][j]+" ");
       
       }
       System.out.println();
       }

       System.out.println("sub :");
       for(int i=0;i<2;i++){    
       for(int j=0;j<2;j++){   
       
       d[i][j]=a[i][j] - b[i][j];   
       System.out.print(d[i][j]+" ");
    }    
    System.out.println();
    
    
    
    }
       
       System.out.println("mul :");
       for(int i=0;i<2;i++){    
       for(int j=0;j<2;j++){   
       
       e[i][j]=a[i][j] * b[i][j];   
       System.out.print(e[i][j]+" ");
    }    
    System.out.println();
    
    
    
    }
       
        System.out.println("div :");
       for(int i=0;i<2;i++){    
       for(int j=0;j<2;j++){   
       
       f[i][j]=a[i][j] / b[i][j];   
       System.out.print(f[i][j]+" ");
    }    
    System.out.println();
    
    
    
    }
    }
}