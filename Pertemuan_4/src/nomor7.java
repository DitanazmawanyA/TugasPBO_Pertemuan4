import java.util.Scanner;

public class nomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double sisi, alas, tinggi, jari;
        double atas, bawah, diagonal1, diagonal2;
        double luas;

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");

        System.out.print("Pilih menu: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                sisi = input.nextDouble();

                luas = sisi * sisi;

                System.out.println("Luas Persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextDouble();

                luas = alas * tinggi / 2;

                System.out.println("Luas Segitiga = " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                jari = input.nextDouble();

                luas = 3.14 * jari * jari;

                System.out.println("Luas Lingkaran = " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas: ");
                atas = input.nextDouble();

                System.out.print("Masukkan sisi bawah: ");
                bawah = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextDouble();

                luas = (atas + bawah) * tinggi / 2;

                System.out.println("Luas Trapesium = " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal pertama: ");
                diagonal1 = input.nextDouble();

                System.out.print("Masukkan diagonal kedua: ");
                diagonal2 = input.nextDouble();

                luas = diagonal1 * diagonal2 / 2;

                System.out.println("Luas Layang-layang = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}