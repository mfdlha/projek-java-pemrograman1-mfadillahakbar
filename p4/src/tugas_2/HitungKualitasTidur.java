package tugas_2;

import java.util.Scanner;

public class HitungKualitasTidur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t1, t2, t3, t4, t5, t6, t7;

        System.out.print("Masukkan jam tidur hari 1 : ");
        t1 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 2 : ");
        t2 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 3 : ");
        t3 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 4 : ");
        t4 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 5 : ");
        t5 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 6 : ");
        t6 = input.nextDouble();
        System.out.print("Masukkan jam tidur hari 7 : ");
        t7 = input.nextDouble();

        double totalTidur = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        double tidurIdeal = 8*7;
        double persenTidur = (totalTidur/tidurIdeal)*100;

        System.out.printf("\nJam tidur idealnya %.1f jam per minggu\n", tidurIdeal);
        System.out.printf("\nTotal jam tidur minggu ini : %.1f jam\n", totalTidur);
        System.out.printf("\nPersentase tidur ideal : %.1f%%\n", persenTidur);
        input.close();
        
    }
}
