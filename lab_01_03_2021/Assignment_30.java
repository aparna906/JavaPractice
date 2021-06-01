/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01_03_2021;

/**
 *
 * @author gauri
 */
public class Assignment_30
{
    static int count=0;
    Assignment_30()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Assignment_30 obj1 = new Assignment_30();
        Assignment_30 obj2 = new Assignment_30();
        Assignment_30 obj3 = new Assignment_30();
        Assignment_30 obj4 = new Assignment_30();
        Assignment_30 obj5 = new Assignment_30();
        Assignment_30 obj6 = new Assignment_30();
        Assignment_30 obj7 = new Assignment_30();
        
        System.out.println("Number of objects created:"+count);
    }
}