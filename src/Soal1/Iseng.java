/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author lenovo
 */
class Iseng {

    public static void main(String[] args) {
        Hewan kewan = new Hewan();
        kewan = new Anjing();
        kewan.suara();
        kewan = new Kucing();
        kewan.suara();
        kewan = new Bebek();
        kewan.suara();
        kewan = new Buaya();
        kewan.suara();
    }
}