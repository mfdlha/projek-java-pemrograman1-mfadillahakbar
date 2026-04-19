package tugas_1;
import java.util.Scanner;

public class tugas_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  NilaiUTS, NilaiTugas, NilaiUAS;
        double Presensi;
        int RealisasiPresensi;
        System.out.println("Masukkan Realisasi Presensi : ");
        RealisasiPresensi = input.nextInt();
        System.out.println("Masukkan Presensi : ");
        Presensi = input.nextDouble();
        System.out.println("Masukkan Nilai UTS : ");
        NilaiUTS = input.nextDouble();
        System.out.println("Masukkan Nilai Tugas : ");
        NilaiTugas = input.nextDouble();
        System.out.println("Masukkan Nilai UAS : ");
        NilaiUAS = input.nextDouble();
        double BatasPresensi = 75;
        double PresensiAkhir = Presensi/RealisasiPresensi*100;
        double TotalPresensi = PresensiAkhir*0.1;
        double TotalUTS = NilaiUTS*0.30;
        double TotalTugas = NilaiTugas*0.20;
        double TotalUAS = NilaiUAS*0.40;
        double TotalNilai = TotalUTS + TotalTugas + TotalUAS + TotalPresensi;
        System.out.println("Realisasi Presensi : " + RealisasiPresensi);
        System.out.println("Presensi : " + PresensiAkhir + " %");
        System.out.println("Presensi : " + TotalPresensi);
        System.out.println("Nilai UTS : " + TotalUTS);
        System.out.println("Nilai Tugas : " + TotalTugas);
        System.out.println("Nilai UAS : " + TotalUAS);
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
        } else if (TotalNilai < 55) {
            System.out.println("Nilai anda : " + TotalNilai  + " Grade E");
        }
        input.close();
    }
}