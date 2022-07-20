package java_week2;
//Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.


public class Que_4 {//Class Que_4

    int a = 10;//Instance variable
    String name = "Java";//Instance variable
    static int b = 15;//static variable
    static String name1 = "World";//static variable

    public static void main(String[] args) {//main method
        Que_4 que = new Que_4();//Create an object
        System.out.println(que.a);//called instance variable using object
        System.out.println(que.name);//called instance variable using object
        Que_4.test1();//called static variable direct
        System.out.println(b);//called static variable direct
        System.out.println(name1);//called stat
    }

    void Test (){//Instance method
        System.out.println(a); //called instance variable direct
        System.out.println(name);//called instance variable direct
        System.out.println(b);//called static variable direct
        System.out.println(name1);//called static variable direct
    }

    static void test1(){//static method
        System.out.println(b);// called static variable direct
        System.out.println(name1);//called static variable direct
        Que_4 que4 = new Que_4();//create an object
        System.out.println(que4.a);//called instance variable using object
        System.out.println(que4.name);//called instance variable using object

    }
}
