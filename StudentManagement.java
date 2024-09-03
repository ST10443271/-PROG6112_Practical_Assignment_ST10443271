/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("**************************************************************");

            while (running) {
                // Main Menu
                System.out.println("Enter (1) to launch menu or any other key to exit");
                String input = scanner.nextLine();
                
                if (!input.equals("1")) {
                    // Exit the application
                    System.out.println("Exiting application...");
                    running = false;
                    continue;
                }
                
                boolean menuRunning = true;
                
                while (menuRunning) {
                    // Display menu
                    System.out.println("Please select one of the following menu items:");
                    System.out.println("(1) Capture a new student.");
                    System.out.println("(2) Search for a student.");
                    System.out.println("(3) Delete a student.");
                    System.out.println("(4) Print student report.");
                    System.out.println("(5) Exit Application");
                    
                    // Get user input for menu selection
                    String menuInput = scanner.nextLine();
                    
                    switch (menuInput) {
                        case "1" -> {
                            // Capture a new student
                            captureStudent(scanner);
                        }
                        case "2" -> {
                            // Search for a student
                            searchStudent(scanner);
                        }
                        case "3" -> {
                            // Delete a student
                            deleteStudent(scanner);
                        }
                        case "4" -> {
                            // Print student report
                            printStudentReport();
                        }
                        case "5" -> {
                            System.out.println("Exiting application...");
                            menuRunning = false;
                            running = false;
                        }
                        default -> System.out.println("Invalid option. Please select a valid menu item.");
                    }
                }
            }
        }
    }
    
    private static void captureStudent(Scanner scanner) {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************************");

        System.out.print("Enter the student ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        int age;
        while (true) {
            System.out.print("Enter the student age (must be 16 or older): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) break;
                else System.out.println("Age must be 16 or older.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, email, course);
        students.add(student);

        System.out.println("*********************************");
        System.out.println("Student details have been successfully saved.");
        System.out.println("*********************************");
    }
    
    private static void searchStudent(Scanner scanner) {
        System.out.print("---------------------------------");
        System.out.print("Enter the student ID to search: ");
        System.out.print("---------------------------------");
        String id = scanner.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("---------------------------------");
                System.out.println("Student found: " + s);
                System.out.println("---------------------------------");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.print("---------------------------------");
            System.out.println("Student cannot be located.");
            System.out.print("---------------------------------");
        }
    }
    
    private static void deleteStudent(Scanner scanner) {
        System.out.print("---------------------------------");
        System.out.print("Enter the student ID to delete: ");
        System.out.print("---------------------------------");
        String id = scanner.nextLine();
        Student toDelete = null;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                toDelete = s;
                break;
            }
        }

        if (toDelete != null) {
            System.out.println("---------------------------------");
            System.out.print("Are you sure you want to delete this student? (yes/no): ");
            System.out.println("---------------------------------");
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
    
    private static void printStudentReport() {
        System.out.println("---------------------------------");
        System.out.println("Student Report:");
        System.out.println("---------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
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



    
        
