package edu.moorparkcollege.geometry;

import java.util.Scanner;

/**
 *
 * @author Allison Bernal
 */
public class Geometry {
    
    public static void main(String[] args) {
        
        /* Declaring Variables */
        double area;
        int length; 

        /* Initialize Scanner Class */
        Scanner data = new Scanner(System.in);

        /* Ask User To Enter a Number 1-4 */
        System.out.print("Enter A Number 1-4: ");
        /* Save Number 1-4 */
        int calculator = data.nextInt();

        switch (calculator) 
        {
            /* Area of a Circle */
            case 1:
                System.out.println("Enter the Radius: ");
                int radius = data.nextInt();
                area = 3.14159 * radius * radius;
                System.out.println("The Area of the Circle is "+area);
                break;
            /* Area of a Rectangle */
            case 2:
                System.out.println("Enter the Length: ");
                length = data.nextInt();
                System.out.println("Enter the Width: ");
                int width = data.nextInt();
                area = length * width;
                System.out.println("The Area of the Rectangle is "+area);
                break;
            /* Area of a Triangle */    
            case 3:
                System.out.println("Enter the Length of the Base: ");
                int base = data.nextInt();
                System.out.println("Enter the Height: ");
                int height = data.nextInt();
                area = base * height;
                System.out.println("The Area of the Triangle is "+area);
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}