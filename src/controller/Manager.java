
package controller;

import java.util.Scanner;
import static view.Validation.checkEven;
import static view.Validation.checkInputIntLimit;
import static view.Validation.checkSquareNumber;
import static view.Validation.checkInputDouble;
import static view.Validation.checkOdd;


public class Manager {
    private static final Scanner in = new Scanner(System.in);

    //dispaly menu
    public static int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }
    //allow user calculate Superlative Equation
    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.print("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    //allow user calculate Quadratic Equation
    public static void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = checkInputDouble();
        System.out.print("Enter B: ");
        double b = checkInputDouble();
        System.out.print("Enter C: ");
        double c = checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (checkEven(a)) {
            System.out.print(a + " ");
        }
        if (checkEven(b)) {
            System.out.print(b + " ");
        }
        if (checkEven(c)) {
            System.out.print(b + " ");
        }
        if (checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
}
