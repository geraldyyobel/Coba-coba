/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author lenovo
 */
public class Segitiga extends BangunDatar {

    private double s1, s2, s3;
    private double keliling, luas;

    Segitiga(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double gets3() {
        return s3;
    }

    @Override
    double getKeliling() {

        return keliling = s1 + s2 + s3;
    }

    @Override
    double getLuas() {
        double s=getKeliling()/2;

        return luas = Math.sqrt(s*(s-getS1())*(s-getS2())*(s-gets3()));
    }

}
