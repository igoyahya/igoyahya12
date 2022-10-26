package bangundatar; // sesuaikan dengan nama package yang kalian buat
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Padma Ekayasa
 */
public class segitiga {
    public static void main(String[] args) {
        int a,t;
        double m, kll,luas;
                
        Scanner segitiga = new Scanner(System.in);
        System.out.print("Masukkan Alas: ");
        a = segitiga.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = segitiga.nextInt();
        System.out.println("");
        
        //menghitung luas
        luas = 0.5*a*t; 
        System.out.println("Luasnya adalah: "+luas);
        //menghitung sisi miring
        m = sqrt((a*a)+(t*t)); 
        //menghitung keliling
        kll = a+t+m; 
        System.out.println("Kelilingnya adalah: "+kll);         
    }
}