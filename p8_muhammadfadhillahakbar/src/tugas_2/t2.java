package tugas_2;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        double nilai;
        double totalNilai = 0;

        System.out.print("- Menghitung Jumlah Nilai -");
        do {
            System.out.print("\nMasukkan Nilai: ");
            nilai = input.nextDouble();
            totalNilai += nilai;
            input.nextLine(); 

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); 
        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("\nJumlah Nilai: " + totalNilai);
        input.close();
    }
}
