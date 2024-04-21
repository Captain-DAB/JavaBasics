/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcome;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Welcome {

    public static void main(String[] args) {
        //display welcome message to the console
        System.out.println("Welcome to Java");
        System.out.println("Programming is fun");
        System.out.println("Fundamentals first");
        System.out.println("Problem driven");
        //Compute Expression
        System.out.println((10.5 + 2 * 3) / (45 - 3.5));

        //Compute Area of a Circle
//        double radius;
        double area;
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        //Compute Area with console Input
        System.out.println("Enter your radius: ");
        double radius = input.nextDouble();

//        radius = 20; // radius is now 20
        // Compute area
        area = radius * radius * PI;
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);

        //Compute Average of three numbers
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = input.nextDouble();

        double average = ((num1 + num2 + num3) / 3);
        System.out.println("The average of the three numbers is " + average);

        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println("j is " + j + " and k is " + k);

        //Assignment Expression or Statements
        //An expression represents a computation involving values, variables, and operators that, taking them together, evaluates to a value
//        int y = 1; // Assign 1 to variable y
//        double radius = 1.0; // Assign 1.0 to variable radius
//        int x = 5 * (3 / 2); // Assign the value of the expression to x
//        x = y + 1; // Assign the addition of y and 1 to x
//        double area = radius * radius * 3.14159; // Compute area
        //1 = x is wrong
        int a, b, c;
        a = b = c = 2;
        System.out.println(a + " " + b + " " + c);

        int x;
        System.out.println(x = 2);
        System.out.println(x);

//        Translate the following algorithm into Java code:
//        Step 1: Declare a double variable named miles with initial value 100.
//        Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 
//        1.609.
//        Step 3: Declare a double variable named kilometers, multiply miles and 
//        KILOMETERS_PER_MILE, and assign the result to kilometers.
//        Step 4: Display kilometers to the console.
//         What is kilometers after Step 4?
        double miles = 100;
        final double KILOMETERS_PER_MILES = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILES;
        System.out.println("Kilometers: " + kilometers);

        System.out.println(Math.pow(2, 3)); // Displays 8.0 
        System.out.println(Math.pow(4, 0.5)); // Displays 2.0
        System.out.println(Math.pow(2.5, 2)); // Displays 6.25
        System.out.println(Math.pow(2.5, -2)); // Displays 0.16
        System.out.println(Math.pow(2, 3.5));

        //Suppose m and r are integers. Write a Java expression for mr^2 to obtain a floating point result.
        int m, r;
        m = 3;
        r = 3;
        System.out.println(m * Math.pow(r, 2));

        //Suppose you and your friends are going to meet in 20 days. What day is in 20 days if today is monday?
        //(1 + 20) % 7 = 21 % 7 = 0, which is a sunday
        //Suppose you and mates are going to meet in 8 days. What day is in 8 days if today is thursday?
        //(4 + 8) % 7 = 12 % 7 = 5, which is a friday
        //Augumented Operators
        double w = 6.5;
        w += 1;
        System.out.println(w);
        w = 6;
        w /= 2;
        System.out.println(w);
    }
}
//Show syntax Error or Compile Error
//Error that occurs due to code construction, mistyping or omitting some necessary punctuation
//public class ShowSyntaxErrors{
//    public static main(String[] args){
//        System.out.println("Welcome to Java);
//    }
//}

//Show Runtime Error
//it makes a program terminate abnormally, runtime error occurs if the environment detects an operation that is impossible to carry out.
//public class ShowRuntimeErrors{
//    public static void main(String[] args){
//        System.out.println(1 / 0);
//    }
//}
//Logic Errors
//Logic errors occur when a program does not perform the way it was intended to.
//public class ShowLogicErrors {
//
//    public static void main(String[] args) {
//        System.out.println("Celsius 35 is Fahrenheit degree ");
//        System.out.println((9 / 5) * 35 + 32); This is corrected as System.out.println((9.0 / 5) * 35 + 32);
//    }
//}
//In general, syntax errors are easy to find and easy to correct because the compiler gives 
//indications as to where the errors came from and why they are wrong. Runtime errors are not 
//difficult to find, either, since the reasons and locations for the errors are displayed on the console 
//when the program aborts. Finding logic errors, on the other hand, can be very challenging.
