package latihan_1;
import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat : ");
        int bilanganBulat = input.nextInt();
        if(bilanganBulat % 2 == 0) {
            System.out.println("Angka " + bilanganBulat + " Bilangan Genap");
        } else {
            System.out.println("Angka " + bilanganBulat + " Bilangan Ganjil");
        }
        input.close();
    }
}
