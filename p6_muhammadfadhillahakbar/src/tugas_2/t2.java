package tugas_2;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTabungan = 0;
        int nominalNabung;

        System.out.print("Masukkan Nominal Tabungan Mingguan : ");
        nominalNabung = input.nextInt();

        for(int hari = 1; hari <= 7; hari++) {
            totalTabungan += nominalNabung;
            System.out.println("Hari ke-" + hari + " : " + totalTabungan);
        }
        System.out.println("Total Tabungan dalam Seminggu : " + totalTabungan);
        input.close();
    } 
}
