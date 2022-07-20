package java_week2;
//1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print
//statement. 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.
public class Que_1 {//class Que_1

    int a = 20;//instance variable
    String name = "sapna";//instance variable

    public static void main(String[] args) {//main method
        Que_1 Q = new Que_1();//Create an Object
        //System.out.println( Q.a);//called instance variable using object name
        Q.add();//called instance variable
    }
    void add(){//instance method

        System.out.println(a);//called instance variable
        System.out.println(name);//called instance variable
    }
}
