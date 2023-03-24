package week6writtenhw;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
import java.util.Scanner;

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner =new Scanner(System.in);//declare scanner
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        scanner.close();//closing scanner

    }
    public static void convertDecimalToBinary(int number){//converting decimal to binary
        String binary = Integer.toBinaryString(number);
        System.out.println("the binary value is :"+ binary);
    }
}
