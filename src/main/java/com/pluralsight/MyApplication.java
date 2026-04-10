package com.pluralsight;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.println("==========================================");
        printNameAndAge(name, age);
        System.out.println("==========================================");
        printEligibility(age);
        System.out.println("==========================================");
        printMessage(name, age);
        System.out.println("==========================================");
        printWelcomeMessage(name);
        System.out.println("==========================================");
        printDrinkingEligibility(name, age);

        double number = getNumber(scanner);
        double squareRoot = getSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("==========================================");

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + ": " + isGreaterThan);

        String welcomeMessage = name.equalsIgnoreCase("lara") ? "You are not welcome" + name + "!" : "Welcome " + name + "!";
        System.out.println(welcomeMessage);
        System.out.println("==========================================");

        double num1 = 5.6;
        double num2 = 3.2;
        double maxNum = getMax(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + maxNum);

        int randomNum = generateRandomNumber();
        System.out.println("Random number between 1 and 0: " + randomNum);
    }

    public static int generateRandomNumber(){
        int min = 1;
        int max = 10;
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static double getMax(double num1, double num2){
        return Math.max(num1, num2);
    }

    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter first number: ");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter second number: ");
        return scanner.nextInt();
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }


    public static double getNumber(Scanner scanner) {
        System.out.println("Give a number: ");
        return scanner.nextDouble();
    }

    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21 ) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }
    }

    /*public static void printWelcomeMessage(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome, Alice");
        } else {
            System.out.println("Welcome, Stranger");
        }
    }*/

    public static void printWelcomeMessage(String name) {
        switch (name.toLowerCase()) {
            case "alice" -> System.out.println("Welcome Alice!");
            case "bob" -> System.out.println("Hey Bob, do you wanna grab a drink?");
            default -> System.out.println("Hello Stranger!");
        }
    }

    public static void printEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter your age: ");
        return scanner.nextInt();
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
