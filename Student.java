/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author Home
 */
class Student {
     private String id;
    private String name;
    private int age;
    private String email;
    private String course;

    // Constructor
    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student ID: " + id 
                +", Name: " + name 
                + ", Age: " + age 
                + ", Email: " + email + 
                ", Course: " + course;
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

    

