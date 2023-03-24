package week6writtenhw;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// declare scanner for reading input in console
        System.out.println("Enter the temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegree(temp);
        scanner.close();//closing scanner
    }
    public void convertTempToDegree(float temp) {//Temperature conversion method
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");

    }
}



