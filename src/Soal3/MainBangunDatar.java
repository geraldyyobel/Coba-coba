/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class MainBangunDatar {

    public static void main(String[] args) {
        System.out.print("Masukan Jumlah Bangun Datar     : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String namaBan;
        BangunDatar[] bangunan = new BangunDatar[n];

        for (int i = 0; i < bangunan.length; i++) {
            System.out.print("Nama Bangunan       : ");
            namaBan = sc.next();
            if ("Segiempat".equals(namaBan)) {

                System.out.print("Panjang         : ");
                double p = sc.nextDouble();
                System.out.print("lebar           : ");
                double l = sc.nextDouble();
                bangunan[i] = new Segi4(l, p);
                System.out.println("");

            } else if ("Lingkaran".equals(namaBan)) {

                System.out.print("Jari Jari       : ");
                double r = sc.nextDouble();
                bangunan[i] = new Lingkaran(r);
                System.out.println("");

            } else if ("Segitiga".equals(namaBan)) {

                System.out.print("Sisi 1          : ");
                double s1 = sc.nextDouble();
                System.out.print("Sisi 2          : ");
                double s2 = sc.nextDouble();
                System.out.print("Sisi 3          : ");
                double s3 = sc.nextDouble();
                bangunan[i] = new Segitiga(s1, s2, s3);
                System.out.println("");
            }
            bangunan[i].setNama(namaBan);

        }
        System.out.println("No \t\t Nama \t\t Keliling \t\t Luas");
        System.out.println("====================================================");
        for (int i = 0; i < bangunan.length; i++) {

            System.out.print((i + 1) + "\t\t" + bangunan[i].getNama()+"\t\t");
            if (bangunan[i] instanceof Segi4){
                Segi4 segi4a;
                segi4a= (Segi4)bangunan[i];
                System.out.println(segi4a.getKeliling()+"\t\t"+segi4a.getLuas());
                
            }
            else if (bangunan[i] instanceof Lingkaran){
                Lingkaran ling;
                ling= (Lingkaran)bangunan[i];
                System.out.println(ling.getKeliling()+"\t\t"+ling.getLuas());
                
            }
            else if (bangunan[i] instanceof Segitiga){
                Segitiga segi3;
                segi3=(Segitiga)bangunan[i];
                System.out.println(segi3.getKeliling()+"\t\t"+segi3.getLuas());
            }
        }
    }
}
