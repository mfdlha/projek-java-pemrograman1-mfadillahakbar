package tugas_3;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        double nilai;
        double totalNilai = 0;
        double jumlahNilai = 0;

        do {
            System.out.print("\nMasukkan Nilai: ");
            nilai = input.nextDouble();
            totalNilai += nilai;
            jumlahNilai++;
            input.nextLine(); 

            System.out.print("Ulangi? (y/t): ");
            pilihan = input.next().charAt(0);
            input.nextLine(); 
        } while (pilihan == 'y' || pilihan == 'Y');
        System.out.println("\nTotal Nilai: " + totalNilai);
        System.out.println("Banyaknya Nilai Yang Diinput: " + jumlahNilai);
        System.out.println("Rata-rata Nilai: " + (totalNilai / jumlahNilai));
        input.close();

    }
}
