package week6writtenhw;
/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter the uppercase sentence ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.converStringToLowerCase(uppercase);
        scanner.close();//scanner closing


    }
    public void converStringToLowerCase(String str){//conver string to lower case
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
