package javaweek7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        Student student = new Student(name, age);
        System.out.println("Student Details: " + student.getName() + ", Age: " + student.getAge());

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        GradeCalculator gc = new GradeCalculator();
        double avg = gc.calculateAverage(grades);
        System.out.println("Average Grade: " + avg);
    }
}
