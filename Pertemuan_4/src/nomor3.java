import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nik, nama;
        int golongan, anak;
        char status;

        double gaji = 0;
        double tunjanganPasangan = 0;
        double tunjanganAnak, totalTunjangan, gajiBersih;

        System.out.print("Masukkan NIK: ");
        nik = input.nextLine();

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan kode golongan (1-4): ");
        golongan = input.nextInt();

        System.out.print("Sudah menikah? (y/t): ");
        status = input.next().charAt(0);

        System.out.print("Jumlah anak: ");
        anak = input.nextInt();

        if (golongan == 1) {
            gaji = 1200000;
        } else if (golongan == 2) {
            gaji = 1500000;
        } else if (golongan == 3) {
            gaji = 1750000;
        } else if (golongan == 4) {
            gaji = 2000000;
        } else {
            System.out.println("Golongan tidak valid");
            return;
        }

        if (status == 'y' || status == 'Y') {
            tunjanganPasangan = gaji * 10 / 100;
        }

        tunjanganAnak = gaji * 5 / 100 * anak;

        totalTunjangan = tunjanganPasangan + tunjanganAnak;
        gajiBersih = gaji + totalTunjangan;

        System.out.println("\nNIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gaji);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Total Tunjangan: Rp" + totalTunjangan);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
}
