package tugas_2;
import java.util.Scanner;

public class VerifikasiPin {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int pinBenar = 4040;
        int tebakPin;

        System.out.println("--Sistem Keamanan--");
        do {
            System.out.println("");
            System.out.print("Masukkan 4 Digit Pin Benar : ");
            tebakPin = input.nextInt();
            if (tebakPin != pinBenar) {
                System.out.print("Akses Ditolak, Pin Salah");
            } else {
                System.out.println("Akses Diterima, Login Berhasil");
            }
        } while (tebakPin != pinBenar);
        input.close();
    }  
} 