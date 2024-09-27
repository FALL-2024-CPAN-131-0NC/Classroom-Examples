package org.humber.week4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    public static final String SCHOOL_NAME = "Humber College";
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


public class MethodExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int initialId = 1000;
        while(true) {
            System.out.print("Enter student name: or  '#' to exit ");
            String name = scanner.nextLine();
            if(name.equals("#")) {
                break;
            }
            Student student = new Student(name, initialId++);
            students.add(student);
        }

        printStudentDetails(students);
    }

    private static void printStudentDetails(List<Student> students) {
        for(Student student : students) {
            student.display();
        }
    }



}
