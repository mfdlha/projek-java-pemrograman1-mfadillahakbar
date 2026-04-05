package tugas_1;

import java.util.Scanner;

public class HitungPersentase {
    static double totalPmakan = 0;
    static double totalPtransport = 0;
    static double totalPbelanja = 0;

    public static void HitungPersentaseAkhir (Scanner input, int hari) {
        int makan, transport, belanja; 

        System.out.println("\nHari ke- " + hari);
        System.out.print("Masukkan harga makanan : ");
        makan = input.nextInt();
        System.out.print("Masukkan harga transport : ");
        transport = input.nextInt();
        System.out.print("Masukkan harga belanja : ");
        belanja = input.nextInt();

        double total = makan + transport + belanja;
        double Pmakan = makan/total*100;
        double Ptransport = transport/total*100;
        double Pbelanja = belanja/total*100;

        totalPmakan += Pmakan;
        totalPtransport += Ptransport;
        totalPbelanja += Pbelanja;

        System.out.printf("Persentase Makan : %.1f%%\n ", Pmakan, "%");
        System.out.printf("Persentase Transport : %.1f%%\n ", Ptransport, "%");
        System.out.printf("Persentase Belanja : %.1f%%\n ", Pbelanja, "%");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahHari = 7;

        HitungPersentaseAkhir(input, 1);
        HitungPersentaseAkhir(input, 2);
        HitungPersentaseAkhir(input, 3);
        HitungPersentaseAkhir(input, 4);
        HitungPersentaseAkhir(input, 5);
        HitungPersentaseAkhir(input, 6);
        HitungPersentaseAkhir(input, 7);

        System.out.println("\nTotal Persentase dalam 7 Hari");
        System.out.printf("Makan : %.1f%%\n", totalPmakan/jumlahHari);
        System.out.printf("Transport : %.1f%%\n", totalPtransport/jumlahHari);
        System.out.printf("Belanja : %.1f%%\n", totalPbelanja/jumlahHari);

        input.close();
    }
}
