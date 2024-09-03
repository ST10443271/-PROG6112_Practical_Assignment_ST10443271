/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Home
 */
class StudentManager {
     private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to save a student
    public void saveStudent() {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************************");
        System.out.print("Enter the student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Enter the student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) break;
                else System.out.println("You have entered a incorrect student age!!!");
                     System.out.println("Please re-enter the student age>>>.");
            } catch (NumberFormatException e) {
                System.out.println("Please re-enter the student age>>>.");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Student details have been successfully saved.");
    }

    // Method to search for a student
    public void searchStudent() {
        System.out.print("Enter the student ID to search: ");
        System.out.println("--------------------------------");
        String id = scanner.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("Student found: " + s);
                System.out.println("---------------------------------");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("---------------------------------");
            System.out.println("Student cannot be located.");
            System.out.println("---------------------------------");
        }
    }

    // Method to delete a student's information
    public void deleteStudent() {
        System.out.print("---------------------------------");
        System.out.print("Enter the student ID to delete: ");
        System.out.println("---------------------------------");
        String id = scanner.nextLine();
        Student toDelete = null;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                toDelete = s;
                break;
            }
        }

        if (toDelete != null) {
            System.out.print("Are you sure you want to delete this student? (yes/no): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                students.remove(toDelete);
                System.out.println("Student deleted.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("---------------------------------");
            System.out.println("Student not found.");
            System.out.println("---------------------------------");
        }
    }

    // Method to generate a student report
    public void studentReport() {
        System.out.println("---------------------------------");
        System.out.println("Student Report:");
        System.out.println("---------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Method to exit the application
    public void exitApplication() {
        System.out.println("Exiting application...");
        scanner.close();
    }

    
}
//Code Atributition 
//This method was taken from geeksforgeeks
//https://www.geeksforgeeks.org/arraylist-in-java/
//GeeksforGeeks

//Code attribution
//This method was taken from youtube
//https://www.youtube.com/watch?v=WCIpkigdOv4&list=PLBlnK6fEyqRiraym3T703apTvEZLaSVtJ&index=17
//Neso Academy
//https://www.youtube.com/@nesoacademy

//Code attribution
//This method was taken from youtube
//https://www.youtube.com/watch?v=IkkndXpmCYs&list=PLBlnK6fEyqRiraym3T703apTvEZLaSVtJ&index=18
//Neso Academy
//https://www.youtube.com/@nesoacademy

//Code attribution
//This method was taken from youtube
//https://www.youtube.com/watch?v=Zs342ePFvRI
//Bro Code
//https://www.youtube.com/@BroCodez

