package latihan_1;

import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.println();
        System.out.println("Program Menghitung Pembagian");
        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input.nextInt();

        double hasilPembagian = (double) angka1/angka2;

        System.out.println("Hasil dari tipe data Double : "+hasilPembagian);
        System.out.println("Hasil dari tipe data Int : " + (int) hasilPembagian);
        input.close();
    }
}
