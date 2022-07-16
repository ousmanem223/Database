import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastNAme;
    private int gradeYear;
    private String StudentID;
    private String courses ="";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Contructor prompt user to enter student's name and year
    public Student() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = reader.nextLine();

        System.out.print("Enter student last name: ");
        this.lastNAme = reader.nextLine();

        System.out.print("1 - Freshman\n2- Sophomore\n3 - Junior\n4- Senior\nEnter student class level: ");
        this.gradeYear = reader.nextInt();

        setStudentID();

    }
    //generate an ID
    private void setStudentID() {
        //Grade level + ID
        id++;
        this.StudentID = gradeYear + "" + id;

    }
    // Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner reader = new Scanner(System.in);
            String course = reader.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);

    }
    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $" );
        Scanner reader = new Scanner((System.in));
        int payment = reader.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show Status
    public String toString() {
        return "Name: " + firstName + " " + lastNAme +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + StudentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance +"\n";
    }
}



