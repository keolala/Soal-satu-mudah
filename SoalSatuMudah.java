import java.util.Scanner;
public class SoalSatuMudah {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang:");
        double length = input.nextDouble();
        System.out.println("Masukkan lebar:");
        double width = input.nextDouble();
        System.out.println("Masukkan tinggi:");
        double height = input.nextDouble();
        System.out.println("Masukkan jarak:");
        double jarak = input.nextDouble();
        System.out.println("Masukkan berat: ");
        double berat = input.nextDouble();

       double volume = length * width * height;
       double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = volume * 4250;
            System.out.println("Biaya yang harus di bayar: " + biayaPerKg);
        } else {
           biayaPerKg = volume * 6000;
            System.out.println("Biaya yang harus di bayar: " + biayaPerKg);
        }
       
        double biayaUtama = berat * biayaPerKg;
        double BiayaTambahan = 0;
        if (volume > 100) {
              BiayaTambahan = 50000;
        }
        double TotalBiaya = biayaUtama + BiayaTambahan;

        System.out.println("Berat paket: " + berat + "kg");
        System.out.println("Jarak pengiriman: " + jarak + "km");
        System.out.println("Volume paket: " + volume + "cm3");
        System.out.println("Biaya per kg: " + biayaPerKg);
        System.out.println("Biaya tambahan: " + BiayaTambahan);
        System.out.println("____________________________________");
        System.out.println("Total biaya: " + TotalBiaya);
        
    }
}
