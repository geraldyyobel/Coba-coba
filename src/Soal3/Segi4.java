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
public class Segi4 extends BangunDatar{
    private double p,l;
    private double keliling,luas;
    
    public Segi4(double l, double p){
        this.l=l;
        this.p=p;
    }
    public void setP(double p){
        this.p=p;
    }
    public double getP(){
        return p;
    }
    public void setL(double l){
        this.l=l;
    }
    public double getL(){
        return l;
    }
    @Override
    double getKeliling(){
        return keliling=p+l;
    }
    @Override
    double getLuas(){
        return luas=p*l;
    }
    
    
}
