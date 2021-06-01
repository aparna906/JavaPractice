/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_27_01_2021;

/**
 *
 * @author gauri
 */
public class operators {

    /**
     *
     * @param args
     */
    public static void main(String []args){
        
       //Unary Operator ++ and --
       
        int x=10;  
        System.out.println(x++);  
        System.out.println(++x);  
        System.out.println(x--);  
        System.out.println(--x );
         System.out.println();

     //Unary Operator ++ and --
     
       int a=1;  
       int b=3;  
       System.out.println(a++ + ++a);  
       System.out.println(b++ + b++);
        System.out.println();
        
     //Unary Operator ~ and !
     
        int e=10;  
        int f=-10;  
        boolean g=true;  
        boolean h=false;  
        
        System.out.println(~e); 
        System.out.println(~f);  
        System.out.println(!g); 
        System.out.println(!h);
         System.out.println();
         
     //Arithmetic Operator
     
       int i=10;  
       int j=5;  
        System.out.println(i+j);
        System.out.println(i-j);  
        System.out.println(i*j);  
        System.out.println(i/j);  
        System.out.println(i%j);  
        System.out.println();
        
        System.out.println("Expression Value : "); 
        System.out.println(10*10/5+3-1*4/2);
         System.out.println();
         
     //Left Shift Operator
     
        System.out.println(10<<2);  //10*2^2=10*4=40   
        System.out.println(10<<3);  //10*2^3=10*8=80  
         System.out.println();
         
     //Right Shift Operator 
     
        System.out.println(10>>2); //10/2^2 = 10/4 = 2  
        System.out.println(20>>2); //20/2^2 = 20/4 = 5 
          System.out.println();
          
     //Shift Operator >> vs >>>
     
        System.out.println(20>>2);  
        System.out.println(20>>>2); 
          System.out.println();
    
        System.out.println(-20>>2);  
        System.out.println(-20>>>2);
            System.out.println();
     //AND Operator (Logical && and Bitwise &)
     
         System.out.println(98<87&&98<90);
         System.out.println(98<87&98<90);
           System.out.println();
           
         //AND Operator (Logical && vs Bitwise &)
           
           int k=10;  
           int l=5;  
           int m=20;
          System.out.println(k<l&&k++<l);  
          System.out.println(k); 
          System.out.println();
          System.out.println(k<l&k++<l);
          System.out.println(k);
            System.out.println();
          
     //OR Operator (Logical || and Bitwise |)
     
           int n=10;  
           int o=5;  
           int p=20;  
         System.out.println(n>o||n<p);
         System.out.println(n>o|n<p);
         System.out.println(n>o||n++<p);
         System.out.println(n>o|n++<p);  
         System.out.println(n);
         System.out.println(n>o|n++<p);
         System.out.println(n); 
            System.out.println();
            
     //Ternary Operator
     
         int q=2;  
         int r=5;  
        int min=(q<r)?q:r;  
       System.out.println(min);  
         System.out.println();
         
      // Assignment Operator
      
        int s=10;  
        s+=3;
      System.out.println(s);  
       s-=4;  
      System.out.println(s);  
       s*=2;  
      System.out.println(s);  
       s/=2;  
     System.out.println(s);
      System.out.println();     
    }
}
        
       
  
