/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studyplanner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class StudyPlan {
    private final List<chapter> chapters;
    private LocalDate testDate;

    // Constructor
    public StudyPlan() {
        this.chapters = new ArrayList<>();
    }

    // Add a chapter
    public void addchapter(chapter chapter) {
        chapters.add(chapter);
    }

    // Set the test date
    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    // Display all chapters
    public void displayChapters() {
        if (chapters.isEmpty()) {
            System.out.println("No chapters added.");
        } else {
            System.out.println("Chapters to study:");
            for (chapter chapter : chapters) {
                System.out.println(chapter);
            }
        }
    }

    // Calculate and display the study plan
    public void displayStudyPlan() {
        if (testDate == null) {
            System.out.println("Test date not set.");
            return;
        }

        long totalDays = ChronoUnit.DAYS.between(LocalDate.now(), testDate);
        long chaptersToStudy = chapters.size();
        
        if (chaptersToStudy == 0) {
            System.out.println("No chapters to study.");
            return;
        }

        long daysPerChapter = Math.max(totalDays / chaptersToStudy, 1); // At least one chapter per day 
        System.out.println("Study Plan:");
        LocalDate studyDate = LocalDate.now();
        for (chapter chapter : chapters) {
            if (!chapter.isCompleted()) {
                System.out.println("Study chapter: " + chapter.getTitle() + " on " + studyDate);
                studyDate = studyDate.plusDays(daysPerChapter);
            }
        }
    }
}
