/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class persegii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sisi;
        
        
        System.out.print("Masukkan sisi   = ");
        sisi = sc.nextInt();
        
        int keliling = 4 * sisi;
        int luas = sisi * sisi;
        
        System.out.println("Keliling Persegi            = " + 4 * sisi);
        System.out.println("Luas Persegi               = " + sisi * sisi);
    }
}