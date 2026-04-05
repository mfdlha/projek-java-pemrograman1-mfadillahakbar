package tugas_1;
import java.util.Scanner;

public class MenghitungLuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PHI = 3.14;
        double radius, LuasLingkaran;

        System.out.print("Masukkan Jari jari Lingkaran : ");
        radius = input.nextDouble();
        
        LuasLingkaran = PHI*radius*radius;

        System.out.println("Total luas lingkaran = " + LuasLingkaran);
        input.close();
    }
}
