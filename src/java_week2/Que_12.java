package java_week2;
//12. Write a Java program to compute the specified expressions and print the
//output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output : 2.138888888888889
public class Que_12 {//class Que_12
    public static void main(String[] args) {//Main method
         double a = 25.5d;
         float b = 3.5f;
         double c = 40.5d;
         float d = 4.5f;

        System.out.println("Expected output:" +((a*b-b*b)/(c-d)));


    }
}
