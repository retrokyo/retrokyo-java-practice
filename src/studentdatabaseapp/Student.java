package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        generateStudentId();
    }

    // Generate an ID
    private void generateStudentId() {
        // Grade level + ID
        this.studentId = gradeYear + "" + id;
        id++;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter course to enroll (Q to quit): ");

            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        }
    }

    // View balance and pay tuition
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        this.tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for you payment of: " + payment);
        viewBalance();
    }

    // Show student status
    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName + "\nStudent ID: " + studentId + "\nGrade Level: "
                + gradeYear + "\nCourses Enrolled: " + courses + "\nBalance: " + tuitionBalance);
    }
}
