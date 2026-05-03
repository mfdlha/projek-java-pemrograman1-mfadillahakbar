package tugas_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class t2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new
            InputStreamReader(System.in));
        String nama = "";
        String alamat = "";

        try {
            System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
            System.out.print("Masukkan Alamat Anda : ");
            alamat = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Ada Kesalahan !");
        }
        System.out.println("Haloo " + nama + "!" + " Kami akan mengirimkan paket ke alamat anda yang berada di " + alamat );
    }
}
