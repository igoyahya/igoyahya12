/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
 
public class lingkaran {
 
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float jari, kel, luas;
        System.out.print("Masukan Nilai Variable Jari = ");
        jari = masukan.nextFloat();
        kel = (float) (2*3.14*jari);
        luas = (float) (3.14*jari*jari);
        System.out.println();
        System.out.println("Hasil Perhitungan = ");
        System.out.println("Keliling = " + kel);
        System.out.println("luas = " + luas);
    }
}