package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private String studentID;
    private int tutitionBalance;
    private int costOfCourse = 600;
    public static int id = 1000;

    // Constructor: promt userto enter Student name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " ID: " + studentID);
    }

    // Generate an ID
    private void setStudentID(){
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // enroll in courses

    // View balance

    // Pay tutition

    // Shoow Status
}
