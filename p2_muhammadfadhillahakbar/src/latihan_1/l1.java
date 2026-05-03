package latihan;

import java.util.Scanner;

public class VariabelJava {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nama, prodi, kelas, asal;
    long nim;

    System.out.print("Masukkan nama anda : ");
    nama = input.next();
    System.out.print("Masukkan nim anda : ");
    nim = input.nextLong();
    input.nextLine();
    System.out.print("Masukkan kelas anda : ");
    kelas = input.nextLine();
    System.out.print("Masukkan prodi anda : ");
    prodi = input.nextLine();
    System.out.print("Masukkan asal anda : ");
    asal = input.nextLine();

    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("Kelas : " + kelas);
    System.out.println("Prodi : " + prodi);
    System.out.println("Asal : " + asal);
    
    input.close();
    }
}
