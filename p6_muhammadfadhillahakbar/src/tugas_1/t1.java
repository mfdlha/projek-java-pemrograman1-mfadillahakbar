package tugas_1;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int totalBayar = 0;
        System.out.println("Sistem Kasir Minimarket");
        do {
            System.out.println("Daftar Barang");
            System.out.println("1. Air Putih (Rp3000)");
            System.out.println("2. Indomie Goreng (Rp4000)");
            System.out.println("3. Minyak Goreng 1L (Rp20000)");
            System.out.println("4. Telur 1/2Kg (16000)");
            System.out.println("5. Selesai dan Hitung Total");
            System.out.println("Total Barang : " + totalBayar);
            System.out.print("Pilih Menu 1-5 : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Air Putih ditambahkan");
                    totalBayar += 3000;
                    break;
                case 2:
                    System.out.println("Indomie Goreng ditambahkan");
                    totalBayar += 4000;
                    break;
                case 3:
                    System.out.println("Minyak Goreng 1L ditambahkan");
                    totalBayar += 20000;
                    break;
                case 4:
                    System.out.println("Telur 1/2Kg ditambahkan");
                    totalBayar += 16000;
                    break;
                case 5:
                    System.out.println("\nMenyiapkan Struk Pembayaran");
                    break;
                default:
                    System.out.println("Error, Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 5);
        System.out.println("\nStruk Belanja");
        System.out.println("Total yang dibayar : " + totalBayar);

        input.close();
    }
}
