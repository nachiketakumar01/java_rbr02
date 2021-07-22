package oopquestion01;
import java.util.Scanner;


/*
Q1: (The Triangle class) Design a class named Triangle that extends               
 GeometricObject. The class contains:                                           
 Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.                            
 ¦ A no-arg constructor that creates a default triangle.                        
 ¦ A constructor that creates a triangle with the specified side1, side2, and  
   side3.                                                                                                                                                   
 ¦ The accessor methods for all three data fields.                            
 ¦ A method named getArea() that returns the area of this triangle.             
 ¦ A method named getPerimeter() that returns the perimeter of this triangle.   
 ¦ A method named toString() that returns a string description for the triangle.
                                                                                
The toString() method is implemented as follows:                         
                                                                                
 return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    
 " side3 = " + side3;*/



public class main{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter sides of a triangle:");
double side01=sc.nextDouble();
double side02=sc.nextDouble();
double side03=sc.nextDouble();
Triangle tr =new Triangle(side01,side02,side03);
System.out.println("area: "+tr.area());
System.out.println("periMETER: "+tr.perimeter());
System.out.println(tr.tostring());
    }
}