import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penjualan, jasa, komisi, pendapatan;

        System.out.print("Masukkan total penjualan: Rp");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = penjualan * 10 / 100;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = penjualan * 15 / 100;
        } else {
            jasa = 300000;
            komisi = penjualan * 20 / 100;
        }

        pendapatan = jasa + komisi;

        System.out.println("Uang Jasa: Rp" + jasa);
        System.out.println("Uang Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + pendapatan);
    }
}