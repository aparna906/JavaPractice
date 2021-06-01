/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_25_01_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            float a, b;
        System.out.println("Enter values of n1 and n2");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        b = scan.nextFloat();

        String prompt = " Enter 0 for addition, Enter 1 for subtraction, Enter 2 for multiplication" +
                "Enter 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input) {
            case 0:
            System.out.print("addition is: ");
            System.out.println(a + b);
            break;

            case 1:
            System.out.print("Subtraction is  : ");
            System.out.println(a - b);
            break;

            case 2:
            System.out.print("Multiple is  : ");
            System.out.println(a * b);
            break;


            case 3:
            System.out.print("Division is  : ");
            System.out.println(a / b);
            break;

            default:
                System.out.println("Please Enter Valid Option");
        }
    }

    }
    
