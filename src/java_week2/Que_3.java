package java_week2;
//3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the print statement.
//3.5 Declare the Main method.
       // 3.6 Call both instance and static methods into the Main method and run the programme.

public class Que_3 {//class Que_3
          int a = 10;
          static  String name = "kiana";

    public static void main(String[] args) {//main method
       Que_3 Q1 = new Que_3();//create an object
        Q1.data();//called instance  using object
        Que_3 Q2 = new Que_3();
        System.out.println(Q2.a);//called instance variable using object
        System.out.println(name);//Called static variable direct


    }

    void data () {//Instance method
        System.out.println(a);//called instant variable direct
        System.out.println(name);//called static variable direct

    }
    static void data1 (){//static method
        System.out.println(name);//called static variable direct
        Que_3 Q1 = new Que_3();
        System.out.println(Q1.a);//called instance variable using object

    }
}
