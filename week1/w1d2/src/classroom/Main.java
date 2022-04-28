package w1d2.src.classroom;

import java.util.Scanner;

public class Main 
{

    public static String navigate()
    {   
        System.out.println("Welcome to [University] Administration. \n\nNavigation:\n 1.Register New Student\n 2.Get Student Details\n 3.Exit"); 
        Scanner scan = new Scanner(System.in);
        String userInput = (String)scan.nextLine();
        scan.close();
        return userInput;
    }

    public static void registerStudent(Student[] studentArr)
    {   

        for(int x = 0; x < studentArr.length; x++)
        {   
            if(studentArr[x] == null)
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Input First Name: ");
                String firstName = scan.nextLine();
                System.out.println("Input Last Name: ");
                String lastName = scan.nextLine();
                System.out.println("Input Age: ");
                int age = scan.nextInt();
                System.out.println("Input Student ID: ");
                int id = scan.nextInt();
                System.out.println("Input Student Major: ");
                String major = scan.nextLine();
                System.out.println("Input GPA: ");
                double gpa = scan.nextDouble();
                Student xStudent = new Student(firstName, lastName, age, id, major, gpa);
                studentArr[x] = xStudent;
                scan.close();
            }
            else
            {
                System.out.println("The class is full this semester.");
            }
        } 
  
    }
    public static void main(String[] args) throws Exception
    {
        boolean run = true;
        String nav;

        System.out.println("...Script Loaded!");
        //hard coded class size limit - memory allocated for 30 student objects
        Student[] studentArr = new Student[30]; 
        
        //key
     

        while(run)
        {

            nav = navigate();

            switch(nav)
            {
                case "1":
                    registerStudent(studentArr);
                    break;
                case "2":
                    //get student information
                    break;
                case "3": 
                    System.out.println("...Exiting");
                    run = false;
                    break;
                default:
                     System.out.println("Welcome to [University] Administration. \n\nNavigation:\n 1.Register New Student\n 2.Get Student Details\n 3.Exit "); 
            }

        }

    }    

}
