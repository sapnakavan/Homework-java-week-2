package java_week2;
//Write a Java program to convert a decimal number to binary number.
//
//Input Data:
//Input a Decimal Number : 5
// Expected Output :Binary number is: 101
public class Que_17 {//class Que_17

        public void decimal(){//instance area
            Que_17 q1 = new Que_17();//create an object
            int decimal = 5;
            System.out.println( "Expected Output : Binary number is :"+(Integer.toBinaryString(decimal))+".");
        }


        public static void main(String[] args) {//main method
            Que_17 obj = new Que_17();
            obj.decimal();
    }
}
