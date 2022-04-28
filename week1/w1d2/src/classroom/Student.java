package w1d2.src.classroom;

import java.util.Scanner;

public class Student extends Person
{
    int id;
    String major;
    double gpa;
    Scanner scan;

    public Student(String firstName, String lastName, int age,int id, String major, double gpa)
    {
        super(firstName,lastName, age);
        this.id = id;
        this.major = major;
        this.gpa = gpa;
        
 
    }

    public void showAccountDetails()
    {
        System.out.println(
            "ID: " + this.id +
            "\nName: " + this.firstName + 
            " " + 
            this.lastName +
            "\nAge: " + this.age +
            "\nMajor: " + this.major +
            "\nGrade: " + this.gpa);
    }

    public void registerStudent(Scanner scan)
    {
        this.scan = scan;

    }
}
