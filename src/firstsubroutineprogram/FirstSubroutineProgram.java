/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstsubroutineprogram;


import java.util.Scanner;

/**
 *
 * This is my First subroutine Program.
 */
public class FirstSubroutineProgram {
/**
 * This is a method that converts a Fahrenheit to Celsius.
 */
    public static void fahrenheitToCelsius(double f) 
    {
        double cTemp;
               
        cTemp = (double)5/(double)9*(f - 32);
        System.out.println("The Celsius temperature is " + cTemp);
    }
 /**
 * This is a method that converts a Celsius to Fahrenheit.
 */
       public static void celsiusToFahrenheit(double c) 
       {
        double fTemp;
               
        fTemp = (double)9/(double)5*c + 32;
        System.out.println("The Fahrenheit temperature is " + fTemp);
       }
 /**
 * This is a method that find the Average of Numbers.
 */       
       public static void findAverage()
       {
        System.out.println("How many numbers you want to enter?");
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        double[] arr = new double[n];
        double total = 0;
        
        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = input.nextDouble();
        }
        input.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);
       }
 /**
 * This is a method that find the area of a triangle.
 */
       public static void findAreaOfTriangle(double h, double b)
       {
        //Area = (width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle is: " + area);
       }
       
 /**
 * This is a method that find the circumference of a circle.
 */
       public static void findCircumferenceOfCircle(double radius, double circumference)
       {
        circumference = Math.PI*2*radius;
        System.out.println("Circumference of the circle is :"+ circumference);   
       }
       
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int choice;
        double num;
        double f; 
        double c;
        double h = 0; 
        double b = 0; 
        double radius;
        double circumference = 0;
         
        System.out.println("1. Fahrenheit to Celsius conversion.");
        System.out.println("2. Celsius to Fahrenheit conversion. ");
        System.out.println("3. Find Average of numbers. ");
        System.out.println("4. Find the Area of a triangle.");
        System.out.println("5. Find the circumference of a Circle.");
         
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
         
         if (choice == 1) 
         {
            System.out.print("Enter a fahrenheit temperature: " );
            f = input.nextInt();
            fahrenheitToCelsius(f);
         } 
         if (choice == 2)
         {
            System.out.print("Enter a fahrenheit temperature: ");
            c = input.nextInt();
            celsiusToFahrenheit(c);
         }
         if (choice == 3) 
         {
            findAverage();
         } 
         if (choice == 4)
         {
            System.out.println("Enter the width of the Triangle:");
            b= input.nextInt();
 
            System.out.println("Enter the height of the Triangle:");
            h= input.nextInt();   
            
            findAreaOfTriangle(h, b);
         }
         if (choice == 5)
         {
            System.out.println("Enter the radius of the circle ::");
            radius = input.nextInt();            
            findCircumferenceOfCircle(radius, circumference);
                        
         }
         
         
    }
    
}
