/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyplanner;

import java.time.LocalDate;
import java.util.Scanner;

public class StudyApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StudyPlan studyPlan = new StudyPlan();
            boolean running = true;
            
            while (running) {
                System.out.println("STUDY PLAN APPLICATION");
                System.out.println("1. Add Chapter");
                System.out.println("2. Set Test Date");
                System.out.println("3. Display Chapters");
                System.out.println("4. Display Study Plan");
                System.out.println("5. Exit");
                
                String choice = scanner.nextLine();
                
                switch (choice) {
                    case "1" -> {
                        // Add Chapter
                        System.out.print("Enter chapter title: ");
                        String title = scanner.nextLine();
                        studyPlan.addchapter(new chapter(title));
                        System.out.println("Chapter added successfully!");
                    }
                    
                    case "2" -> {
                        // Set Test Date
                        System.out.print("Enter test date (yyyy-mm-dd): ");
                        String dateInput = scanner.nextLine();
                        try {
                            LocalDate testDate = LocalDate.parse(dateInput);
                            studyPlan.setTestDate(testDate);
                            System.out.println("Test date set successfully!");
                        } catch (Exception e) {
                            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
                        }
                    }
                    
                    case "3" -> // Display Chapters
                        studyPlan.displayChapters();
                        
                    case "4" -> // Display Study Plan
                        studyPlan.displayStudyPlan();
                        
                    case "5" -> {
                        // Exit
                        System.out.println("Exiting application...");
                        running = false;
                    }
                    
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
