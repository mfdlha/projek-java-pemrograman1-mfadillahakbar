package tugas_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class KalkulatorDiskon {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String hargaBarang = "";
        String diskonHarga = "";

        try {
            System.out.print("Masukkan Harga Barang : ");
            hargaBarang = dataIn.readLine();
            double Barang = Double.parseDouble(hargaBarang);
            System.out.print("Masukkan Diskon Harga (%) : ");
            diskonHarga = dataIn.readLine();
            double Diskon = Double.parseDouble(diskonHarga);

            double setelahDiskon = Barang*Diskon/100;
            double hargaAkhir = Barang-setelahDiskon;

            Locale localeID = Locale.forLanguageTag("id-ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
            String hasilAkhir = formatRupiah.format(hargaAkhir);
            String barangRupiah = formatRupiah.format(Barang);
            String setelahDiskonRp = formatRupiah.format(setelahDiskon);

            System.out.println("");
            System.out.println("Harga barang sebelum diskon : " + barangRupiah);
            System.out.println("Diskon " + Diskon + " %");
            System.out.println("Potongan harga Diskon " + setelahDiskonRp);
            System.out.println("Harga Barang Setelah Diskon : " + hasilAkhir);
        }
        catch (IOException e){
            System.out.print("Ada Kesalahan !");
        }

    }
}
