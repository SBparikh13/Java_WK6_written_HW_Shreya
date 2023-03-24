package week6writtenhw;
/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter the width of rectangle :");
        int width= scanner.nextInt();
        System.out.println("Enter the height of rectangle is :");
        int height = scanner.nextInt();
        areaAndPerimeterOfRectangle(height,width);
        scanner.close();//closing scanner
    }
    public static void areaAndPerimeterOfRectangle(int height,int width){//calculating area and perimeter of rectangle
        int perimeter = 2*(height + width);
        int area = (height*width);
        System.out.println("The area of the rectangle is :  "+ area);
        System.out.println("The perimeter of the rectangle is : "+ perimeter);

    }
}
