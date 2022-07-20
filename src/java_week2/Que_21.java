package java_week2;

//Make class save your name in string variable and use all string methods.

public class Que_21 {//class Que_21
    public static void main(String[] args) {//main method
        String name = "My name is Sapna.";
        String name1 = "I live in london.";


          //length of the string
        System.out.println("Length of String is : " +name.length());
        //return char value at the given index number
        System.out.println("Char value : " +name.charAt(5));
        //Combines specified string at the end of this string
        System.out.println("Combines specified string : " +name.concat(name1));
        //return true if chars are found in the string
        System.out.println("If chars are found in string : " +name.contains("is"));
        //checks if this string starts with given prefix
        System.out.println("If string start given prefix : " +name.startsWith("M"));
        //check if this string ends with given strings
        System.out.println("If string start given suffix : " +name.endsWith("n"));
        //compare the contents of two given string
        System.out.println("Compares the contents :  " +name.equals(name1));
        //return index of given character value or substring
        System.out.println("Return index of given character value : " +name.indexOf("leave"));
        //check if this string is empty
        System.out.println("Is this string empty :" +name.isEmpty());
        //return a string replacing all the old char to new char
        System.out.println("String replacing char to new char : " +name.replace('s','t'));
        //return a part of the string
        System.out.println("Return a part of the string : " +name.substring(8));
        //convert this string into character array
        System.out.println("Convert this string to array : " +name.toCharArray());
        //returns the string is lowercase letter
        System.out.println("Lowercase :" +name.toLowerCase());
        //return the string in uppercase letter
        System.out.println("Uppercase :" +name.toUpperCase());
        //eliminates leading and trailing spaces
        System.out.println("Trim :" +name1.trim());


    }

}
