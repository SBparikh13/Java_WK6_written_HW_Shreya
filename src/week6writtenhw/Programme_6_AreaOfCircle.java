package week6writtenhw;
/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
import java.util.Scanner;

public class Programme_6_AreaOfCircle {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);// scanner declaration
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);

    }
    public static void areaOfCircle(double radius){//calculating the area of circle
        double pi = Math.PI;
        double area = (pi * radius *radius );
        System.out.println("The area of circle is :" + area);
    }
}
