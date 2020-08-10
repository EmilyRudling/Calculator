package com.example.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("welcome to the calculator!");
        int rand1 = generateRandom();
        int rand2 = generateRandom();
        System.out.println("Number 1" + rand1);
        System.out.println("Number 2" + rand2);
        System.out.println("Enter add(+), subtract(-), multiply(*) or divide(/): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(calculateResult(rand1, rand2, input));
    }

    public static int generateRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }

    public static String calculateResult(int int1, int int2, String maths){
        switch (maths){
            case "+":
                return Integer.toString(int1 + int2);
            break;
            case "-":
                return Integer.toString(int1 - int2);
            break;
            case "*":
                return Integer.toString(int1 * int2);
            break;
            case "/":
                return Integer.toString(int1 / int2);
            break;
            default:
                return "That is not a valid input";
            break;
        }
    }
}
