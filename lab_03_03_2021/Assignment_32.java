/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03_03_2021;

/**
 *
 * @author gauri
 */
class Box
{
    double width;
    double height;
    double depth;

    Box()
    {
        System.out.println("Constructing Box");
        width = 100;
        height = 100;
        depth = 100;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class Assignment_32
{
    public static void main(String args[])
    {
        
        /* declare, allocate, and initialize the Box objects */
        Box box1 = new Box();
        Box box2 = new Box();
        
        double vol;
        vol = box1.volume();
        System.out.println("Volume of the first box is " + vol);
        vol = box2.volume();
        System.out.println("Volume of the second box is " + vol);
        
    }
}