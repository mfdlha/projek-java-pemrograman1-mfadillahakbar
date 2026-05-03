package latihan_1;
import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Bahasa Pemrograman");
        System.out.println("1. Python");
        System.out.println("2. C++");
        System.out.println("3. Java");
        System.out.println("Masukkan Angka untuk memilih bahasa pemrograman : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Python!");
                break;
            case 2:
                System.out.println("Anda memilih C++!");
                break;
            case 3:
                System.out.println("Anda memilih Java!");
                break;
            default:
                System.out.println("Angka yang anda ketik tidak ada di menu");
                break;
        }
        System.out.println("Program Selesai");
        input.close();
    }
}
