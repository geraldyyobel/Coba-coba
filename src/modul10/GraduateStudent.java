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
public class GraduateStudent extends Student {

    public GraduateStudent(String name, int[] test, String courseGrade) {
        super(name, test, courseGrade);
    }



    @Override
    public String getCourseGrade() {
        int total = 0;
        for (int i = 0; i < test.length; i++) {
            total = total + test[i];
        }
        double rata = total / test.length;
        if (rata > 85) {
            System.out.println("PASS");
        } else {
            System.out.println("NO PASS");
        }
        return courseGrade;
    }
}
