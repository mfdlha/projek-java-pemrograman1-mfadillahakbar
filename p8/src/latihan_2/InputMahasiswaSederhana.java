package latihan_2;

import java.util.Scanner;

public class InputMahasiswaSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
            System.out.print("nama: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            String nim = input.nextLine();

            System.out.print("Data: " + nama +" - "+ nim);

            System.out.print(" Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // membersihkan buffer
        } while (ulang == 'y' || ulang == 'Y');
        input.close();
    }
}
