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
public class Lingkaran extends BangunDatar{
    private double r;
    private double keliling,luas;
    public Lingkaran(double r){
        this.r=r;
    }
    public void setR(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    @Override
    double getKeliling(){
        return keliling=(22/7)*2*r;
    }
    @Override
    public double getLuas(){
        return luas=(22/7)*r*r;
    }
    
}
