package java_week2;
//Write a program to insert any temperature value in degree Fahrenheit and convert
//to degree Celsius ((F − 32) × 5/9 = 0°C).
public class Que_8 {//class Que_8
    public static void main(String[] args) {//main method
        float f = 52;//variable
        float celsius;
        celsius = ((f - 32) * 5 / 9);
        System.out.println("convert fahrenheit to celsius : " + celsius);
    }
}