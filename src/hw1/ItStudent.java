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
public class ItStudent extends Student {

    double mid,
            project,
            fin;

    public ItStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
    }

    ItStudent() {
        super();
    }

    double calcualteGrade(double min, double project, double fin) {
        double grade = mid * 0.30 + project * 0.30 + fin * 40;
        return grade;
    }

   
}
