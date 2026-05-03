package tugas_2;

import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class KonversiMataUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiTukar = 16994.60;
        double jumlahUang;

        System.out.print("Masukkan Jumlah Uang : ");
        jumlahUang = input.nextDouble();

        double dollar = jumlahUang/nilaiTukar;
        Locale localeID = Locale.forLanguageTag("id-ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);

        String hasilRupiah = formatRupiah.format(jumlahUang);
        String hasilUS = formatUS.format(dollar);
        System.out.println("Format Rupiah : " + hasilRupiah);
        System.out.println("Format US : " + hasilUS);

        input.close();
    }
}
