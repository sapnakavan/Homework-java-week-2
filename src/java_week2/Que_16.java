package java_week2;
//Write a Java program to add two binary numbers.
//
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output:
//
//Sum of two binary numbers: 101
public class Que_16 {//class Que_16

    public static void main(String[] args) { //main method
        byte b1=0b10;
        byte b2=0b11;
        int result;
        result=b1+b2;
        System.out.println("Sum of two binary numbers :" +Integer.toBinaryString(result));
    }
}
