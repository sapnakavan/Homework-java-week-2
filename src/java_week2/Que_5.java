package java_week2;
//Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)
public class Que_5 {
    public static void main(String[] args) {
        Que_5 q = new Que_5();// create an object
        q.addition(20,10);//Called static method using object for addition
        q.subtraction(50,10);//called static method using object for subtraction
        q.multiplication(10,20);//called void method using object for multiplication
        q.division(40,10);//called void method using object for division

    }

    public static int   addition (int a,int b){
        int result =(a+b);
        System.out.println(result);
        return result;
    }

    public static int  subtraction (int d ,int f){
        int result1 =(d-f);
        System.out.println(result1);
        return result1;

    }
    public int multiplication(int x, int y){
       int result2 = (x*y);
        System.out.println(result2);
        return result2;
    }

    public int division( int s,int r){
        int result3 = (s*r);
        System.out.println(result3);
        return result3;
    }


}
