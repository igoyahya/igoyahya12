package bangundatar;
import javax.swing.JOptionPane;
public class biodata {
    public static void main(String[] args) {

//Perintah meginputkan data
        String nim = "";
        nim=JOptionPane.showInputDialog("Inputkan Nama  : ");
        String nama = "";
        nama=JOptionPane.showInputDialog("Inputkan Kelas : ");
        String alamat = "";
        alamat=JOptionPane.showInputDialog("Inputkan Absen : ");
        String email = "";
        email=JOptionPane.showInputDialog("Inputkan Almat : ");
        String nohp = "";
        nohp=JOptionPane.showInputDialog("Inputkan No Hp : ");

        //Menampilkan data yang telah di input
        javax.swing.JOptionPane.showMessageDialog(null,"nama : "+nim
                +"\nKelas : "+nama
                +"\nAbsen : "+alamat
                +"\nAlamat : "+email
                +"\nNo HP : "+nohp);
    }
    
}
