package week6writtenhw;

import java.util.Scanner;
/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// declare scanner
        System.out.println("Enter the Uppercase string  ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.covertUppercastToLowercase(uppercase);
        scanner.close();//closing scanner

    }
    public void covertUppercastToLowercase(String text){//conversion of uppercase to lowercase
        System.out.println("The lowercase value is = " + text.toLowerCase());
    }


}
