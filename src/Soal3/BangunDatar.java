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
public abstract class BangunDatar {
    private String nama;
    private double keliling,luas;
    
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKeliling(double keliling){
        this.keliling=keliling;
    }
    abstract double getKeliling();
    
    public void setLuas(double luas){
        this.luas=luas;
    }
    abstract double getLuas();
    
}
