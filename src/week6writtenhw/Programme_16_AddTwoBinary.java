package week6writtenhw;
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {// declare scaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first Binary number :");
        String first = scanner.nextLine();
        System.out.println("Please enter second Binary number :");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two Binary number is :"+ addition);
        scanner.close();//closing scanner

    }
    public static String addTwoBinaryNumbers(String first,String second){//adding two binary numbers
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1 +b2 ;
        return Integer.toBinaryString(sum);

    }

}
