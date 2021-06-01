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
public class Assignment_12 {
public static void main(String args[]){
    int n, num1 = 0, num2 = 1;
        System.out.println("Enter the value of n :");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+ n +" numbers:");

        int i=1;
        while(i<=n)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
    }
}    
}
