package week6writtenhw;

import java.util.Scanner;
/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// declare scanner for reading input form console
        System.out.println("Enter the length of Triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of Triangle : ");
        int height = scanner.nextInt();
        areaOfTriagle(length,height);
        scanner.close();// closing scanner
    }
    public  static void areaOfTriagle(int length, int height){////Calculating the area of triangle with no return type with parameter method
        int area = (length*height)/2;
        System.out.println("The area of triangle is :" + area);

    }











}
