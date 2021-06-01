/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_24_02_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
class Complex{
    float img_no;
    float real_no;
    
    void getData(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Real no ");
        
        real_no=scan.nextFloat();
        System.out.println("Enter the imaginary no. ");
        img_no=scan.nextFloat();
        
    }
    void sum(Complex c1, Complex c2)
    {
        real_no = c1.real_no + c2.real_no;
        img_no = c1.img_no + c2.img_no;
        System.out.println(real_no + "+" +img_no + "i");
       
    }
    
    void sub(Complex c1, Complex c2)
    {
        real_no = c1.real_no - c2.real_no;
        img_no = c1.img_no - c2.img_no;
       System.out.println((real_no) + "-" +Math.abs(img_no) + "i");
    }
    
    void mul(Complex c1, Complex c2)
    {
        real_no = c1.real_no * c2.real_no;
        img_no = c1.img_no * c2.img_no;
       System.out.println((real_no) + "*" +Math.abs(img_no) + "i");
    }
    };

public class Assignment_26 {
    public static void main(String[]args){
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex c3=new Complex();
        
        System.out.println("Enter real and imaginary part of first complex number");
        c1.getData();
        
        System.out.println("Enter real and imaginary part of second complex number");
        c2.getData();
        
        System.out.println("Sum of two complex number is");
        c3.sum(c1, c2);
        
        System.out.println("sub of two complex number is");
        c3.sub(c1,c2);
        
        System.out.println("multilpy of two complex number is");
        c3.mul(c1,c2);
    }
}
    
