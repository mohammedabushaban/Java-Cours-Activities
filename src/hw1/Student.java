/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author MoHammeD
 */
public abstract class Student {

    static int id;
    static String name;
    static String major;
    static Double grade;

    public Student(int id, String name, String major, Double grade) {
        super();
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setMajor(String major) {
        Student.major = major;
    }

    public static void setGrade(Double grade) {
        Student.grade = grade;
    }

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getMajor() {
        return major;
    }

    public static Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", major=" + major
                + ", grade=" + grade + "]";
    }
    
    public Student() {
       super();
   }
}
  
