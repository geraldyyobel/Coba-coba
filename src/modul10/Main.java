/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul10;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of the Student       : ");
        int value = sc.nextInt();
        Student[] student = new Student[value];
        Student[] testscore = new Student[3];
        for (int i = 0; i < student.length; i++) {
            System.out.print("Name Student      : ");
            String nama = sc.next();

            for (int j = 0; j < testscore.length; j++) {
                System.out.print("Test Score" + (i + 1) + "   : ");
                int test = sc.nextInt();
                testscore[j].setTestScore(test);
            }

            System.out.print("Name of Degree      : ");
            String graduate = sc.next();
            student[i].setTestScore(testscore);
            student[i].setName(nama);
            student[i].setCourseGrade(graduate);
            System.out.println("");

        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] instanceof GraduateStudent) {
                GraduateStudent grad;
                grad = (GraduateStudent) student[i];
                System.out.println("Name            : " + grad.getName());
                System.out.println("Name of Degree  : Graduate Student");
                System.out.println(grad.getCourseGrade());
            } else if (student[i] instanceof UnderGraduateStudent) {
                UnderGraduateStudent Ungrad;
                Ungrad = (UnderGraduateStudent) student[i];
                System.out.println("Name            : " + Ungrad.getName());
                System.out.println("Name of Degree  : Under Graduate Student");
                System.out.println(Ungrad.getCourseGrade());
            }
        }

    }
}
