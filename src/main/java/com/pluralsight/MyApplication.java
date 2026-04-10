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
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21 ) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }
    }

    public static void printWelcomeMessage(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome, Alice");
        } else {
            System.out.println("Welcome, Stranger");
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
