package java_week2;
//Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

public class Que_18 {//class Que_18
    public static void main(String[] args) {//main method
        int a = 125;
        int b = 24;
        System.out.println("Expected Output : ");
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+a+"="+(a-b));
        System.out.println(a+"*"+b+"=" +a*b);
        System.out.println(a+"/"+b +"=" +a/b);
        System.out.println(a+ "mod"+b+"=" +a%b);
    }
}
