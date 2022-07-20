package java_week2;

//Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//Test Data: Input a number: 8
//Expected Output :
//
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//... double area=math.PI
//8 x 10 = 80
public class Que_10 {
    public void UpTo10() {  // instance area
        Que_10 q1 = new Que_10(); // create a new object
        System.out.println("Expected Output : ");//printing statment
        int num1 = 8;
        for (int i = 0; i < 10; i++) {// for loop where i =  initialize control variable, i <10 is checking condition
                                       // ,i++ is incremental loop control variabl
            System.out.println(num1 + " x " + (i + 1) + "=" + (num1 * (i + 1)));
        }


    }

    public static void main(String[] args) {  //main method
        Que_10 num= new Que_10();   // object
        num.UpTo10();

    }
}
