/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

/**
 *
 * @author lenovo
 */
public abstract class Student {

    public int NUM_OF_TEST = 3, testscore;
    private String name;
    String courseGrade;
    int[] test=new int[NUM_OF_TEST];

    Student(String name, int[] test, String courseGrade) {
        this.name = name;
        this.test = test;
        this.courseGrade = courseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseGrade() {
        return courseGrade;
    }
    public void setCourseGrade(String courseGraduate){
        this.courseGrade=courseGraduate;
    }
    public void setTestScore(int[] testscore) {
    this.test=testscore;    
    }

    void setTestScore(int testscore) {
        this.testscore=testscore;
    }

    void setTestScore(Student[] testscore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
