import java.util.Scanner;

public class nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int member;
        double belanja, diskon = 0;
        double total, uang, kembalian;

        System.out.print("Memiliki kartu member? (1=Ya, 0=Tidak): ");
        member = input.nextInt();

        System.out.print("Masukkan total belanja: Rp");
        belanja = input.nextDouble();

        if (member == 1) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        total = belanja - diskon;

        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + total);

        System.out.print("Masukkan uang pembayaran: Rp");
        uang = input.nextDouble();

        if (uang >= total) {
            kembalian = uang - total;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang pembayaran kurang!");
        }
    }
}