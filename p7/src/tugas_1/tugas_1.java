package tugas_1;
import java.util.Scanner;

public class tugas_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  NilaiUTS, NilaiTugas, NilaiUAS;
        double RealisasiPresensi, Presensi;
        System.out.println("Masukkan Realisasi Presensi : ");
        RealisasiPresensi = input.nextDouble();
        System.out.println("Masukkan Presensi : ");
        Presensi = input.nextDouble();
        System.out.println("Masukkan Nilai UTS : ");
        NilaiUTS = input.nextInt();
        System.out.println("Masukkan Nilai Tugas : ");
        NilaiTugas = input.nextInt();
        System.out.println("Masukkan Nilai UAS : ");
        NilaiUAS = input.nextInt();
        double BatasPresensi = 75;
        double PresensiAkhir = Presensi/RealisasiPresensi*100;
        int TotalUTS = NilaiUTS*30/100;
        int TotalTugas = NilaiTugas*20/100;
        int TotalUAS = NilaiUAS*40/100;
        double TotalNilai = TotalUTS + TotalTugas + TotalUAS + PresensiAkhir;
        System.out.println("Total Presensi : " + PresensiAkhir + " %");
        System.out.println("Total Nilai : " + TotalNilai);

        if (PresensiAkhir >= BatasPresensi) {
            if (TotalNilai >= 80) {
                System.out.println("Grade A");
            } else if (TotalNilai >= 70) {
                System.out.println("Grade B");
            } else if (TotalNilai >= 60) {
                System.out.println("Grade C");
            } else if (TotalNilai >= 55) {
                System.out.println("Grade D");
            } else if (TotalNilai < 55) {
                System.out.println("Grade E");
            } else {
                System.out.println("");
            }
        } else if (TotalNilai >= 55) {
            System.out.println("Nilai anda : " + TotalNilai + " Grade D");
            System.out.println("Grade B");
        } else if (TotalNilai < 55) {
            System.out.println("Nilai anda : " + TotalNilai  + " Grade E");
        }
        input.close();
    }
}