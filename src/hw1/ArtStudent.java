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
public class ArtStudent extends Student{
    
     double mid,
           report,
           fin;
    
    public ArtStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
    }

   public ArtStudent(){
       super();
   }

    
    
    double calcualteGrade(double min,double report,double fin){
        double grade = mid*0.40 + report*0.10 + fin*50;
        return grade;
    }
    
    
   
}
