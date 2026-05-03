package tugas_1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            String nim = input.nextLine();

            System.out.print("Nilai: ");
            double nilai = input.nextDouble();
            input.nextLine(); 

            System.out.println("Data: " + nama + " - " + nim + " - " + nilai);

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); 
        } while (ulang == 'y' || ulang == 'Y');
        input.close();
    }
}