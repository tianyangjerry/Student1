package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("What is your name?");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        student.setStudentName(name);
        System.out.println("What is your student ID?");
        Scanner scanner2 = new Scanner(System.in);
        String id = scanner2.nextLine();
        student.setStudentId(id);
        System.out.println("Please input your time:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number = 0;
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Please input your extra activity:");
            String input = scanner.nextLine();
            number = student.addExtraActivity(input);
        }
        System.out.println("You have " + number + " activities.");
    }
}