package com.example.calculator;
import java.util.Scanner; //allows me to read user input
import java.util.Random; //allows me to use the random number feature

public class Calculator {
    public static void main(String[] args) {
        System.out.println("welcome to the calculator!");
        int rand1 = getNumber();
        int rand2 = getNumber();
        System.out.println("Number 1" + rand1);
        System.out.println("Enter add(+), subtract(-), multiply(*) or divide(/): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Number 2" + rand2);
        System.out.println(calculateResult(rand1, rand2, input));
    }

    public static int getNumber() {
        System.out.println("Enter the first integer");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        return Integer.parseInt(number); //converts a string to an integer
    }

    public static String calculateResult(int int1, int int2, String maths){
        switch (maths){
            case "+":
                return Integer.toString(int1 + int2);
            case "-":
                return Integer.toString(int1 - int2);
            case "*":
                return Integer.toString(int1 * int2);
            case "/":
                return Integer.toString(int1 / int2); //did not need the break statements, return does this already
            default:
                return "That is not a valid input";
        }
    }
}
