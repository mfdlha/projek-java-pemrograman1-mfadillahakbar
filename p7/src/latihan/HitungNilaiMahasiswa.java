package latihan;
import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Kehadiran : ");
        double kehadiran = input.nextDouble();
        System.out.println("Masukkan Nilai Akhir : ");
        int nilaiAkhir = input.nextInt();

        String GradeA = ("A");
        String GradeB = ("B");
        String GradeC = ("C");
        String GradeD = ("D");
        String GradeE = ("E");

        double batasPresensi = 75;
        double presensiAkhir = kehadiran/21*100;
        System.out.println("Total Presensi : " + presensiAkhir + " %");

        if ( presensiAkhir >= batasPresensi ) {
            if (nilaiAkhir >= 80) {
                System.out.println(GradeA);
            } else if (nilaiAkhir >= 70) {
                System.out.println(GradeB);
            } else if (nilaiAkhir >= 60) {
                System.out.println(GradeC);
            } else if (nilaiAkhir >= 55) {
                System.out.println(GradeD);
            } else if (nilaiAkhir < 55) {
                System.out.println(GradeE);
            } else {
                System.out.println("");
            }
        } else if (nilaiAkhir >= 55) {
            System.out.println("Nilai anda : " + nilaiAkhir + " Grade D");
            System.out.println("Grade B");
        } else if (nilaiAkhir < 55) {
            System.out.println("Nilai anda : " + nilaiAkhir + " Grade E");
        }
        input.close();
    }
}