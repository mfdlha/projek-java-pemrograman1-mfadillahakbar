package latihan_1;

import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Realisasi : ");
        int realisasiPresensi = input.nextInt();
        System.out.print("Masukkan Presensi : ");
        double presensi = input.nextDouble();
        int tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = input.nextInt();

        double hasilPresensi = presensi/realisasiPresensi*10;
        int hasilTugas = tugas*20/100;
        int hasilUTS = uts*30/100;
        int hasilUAS = uas*40/100;
        double total = hasilPresensi + hasilTugas + hasilUTS + hasilUAS;

        System.out.println("Presensi : " + presensi);
        System.out.println("Tugas : "+ tugas);
        System.out.println("UTS: "+ uts);
        System.out.println("UAS : "+ uas);
        System.out.printf("Total Nilai Adalah %.1f\n",total);
        input.close();
    }
}
