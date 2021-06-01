/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_24_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri.
 */
class Student{
    int roll_no;
    String name;

void getData(){
 System.out.println("Roll no : " +roll_no);
 System.out.println("Name :" +name);
}

void putData(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the name ");
    name=scan.nextLine();
    System.out.println("Enter the roll no. ");
    roll_no=scan.nextInt();
}
}
public class Assignment_25 {
    public static void main(String[]args){
       Student s1=new Student();  
       s1.putData();  
       s1.getData(); 
    
    }
    }
    


