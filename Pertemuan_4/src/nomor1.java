import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        System.out.print("masukkan Nama: ");
        angka = input.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
    }
}
