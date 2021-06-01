/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01_03_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */

class Emp{
    String Name;
    Double Salary;
    
    void getdata(){
        System.out.print("Enter the Name :");
        System.out.println(Name );
        
        System.out.println("Enter the Salary :"+Salary);
    }
    
    void putData(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Name :");
        Name=scan.nextLine();
        System.out.println("Enter the Salary :");
        Salary=scan.nextDouble(); 
    }
}
public class Assignment_29 {
    public static void main(String args[]){
        Emp E1=new Emp();
        E1.putData();
        E1.getdata();
    }
}
