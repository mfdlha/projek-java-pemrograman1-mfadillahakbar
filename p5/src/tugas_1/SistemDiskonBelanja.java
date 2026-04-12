package tugas_1;
import java.util.Scanner;

public class SistemDiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Total Belanjaan Anda : ");
        double totalBelanja = input.nextDouble();
        double diskon = 0;
        double persentaseDiskon = 0;

        if (totalBelanja >= 100000) {
            persentaseDiskon = 10;
            diskon = totalBelanja * 0.10;
        } else if (totalBelanja >= 50000) {
            persentaseDiskon = 5;
            diskon = totalBelanja * 0.05;
        } else {
            persentaseDiskon = 0;
            diskon = 0;
        }
        double totalBayar = totalBelanja - diskon;

        System.out.println("Struk Belanja");
        System.out.println("Total Awal : " + totalBelanja);
        if (persentaseDiskon > 0) { 
            System.out.println("Diskon (" + (int) persentaseDiskon + "%) : " + diskon);
        } else {
            System.out.println("Diskon : " + diskon + "(Tidak ada diskon)");
        } 
        System.out.println("Total bayar : " + totalBayar);
        input.close();
    }
}
