import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String nama;
        int usia;
        double jumlahUang;
        double rataPengeluaranHarian;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Usia : ");
        usia = input.nextInt();
        System.out.print("Masukkan Jumlah Uang : ");
        jumlahUang = input.nextDouble();
        System.out.print("Masukkan Rata-Rata Pengeluaran Harian : ");
        rataPengeluaranHarian = input.nextDouble();

        double usiaDbl = (double) usia;
        int jumlahUangInt = (int) jumlahUang;
        String statusKeuangan;

        double estimasiSisaSebulan = jumlahUangInt - (rataPengeluaranHarian * 30);
        double estimasiBulanBertahan = jumlahUangInt / (rataPengeluaranHarian * 30);
        if (estimasiBulanBertahan < 1){
            statusKeuangan = "PERINGATAN: Keuangan Anda Kurang Stabil!";
        } else {
            statusKeuangan = "Keuangan Anda Dalam Kondisi Aman";
        }

        boolean perbandinganUsia = usia > 30;
        boolean perbandinganUang10 = jumlahUang > 10000000;
        boolean perbandinganUang5 = jumlahUang > 10000000;
        System.out.println("\nApakah usia lebih dari 30? " + perbandinganUsia);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + (perbandinganUsia && perbandinganUang10));
        System.out.println("Apakah usia > 30 dan uang > 5 juta? " + (perbandinganUsia && perbandinganUang5) + "\n");

        double hutang;
        double abshutang;
        double pembulatanRataHarian;
        double bonusTakTerduga;
        int max = 1000000;
        int min = 100000;
        System.out.print("Masukkan Jumlah Hutang : ");
        hutang = input.nextDouble();
        abshutang = Math.abs(hutang);   
        pembulatanRataHarian = Math.ceil(rataPengeluaranHarian);
        bonusTakTerduga = Math.random() * (max - min) + min;
        

        System.out.println("\n===LAPORAN KEUANGAN PRIBADI===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usiaDbl);
        System.out.println("Uang yang dimiliki: " + jumlahUangInt);
        System.out.println("Pengeluaran harian rata-rata: " + rataPengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: " + estimasiSisaSebulan);
        System.out.println("Estimasi bulan bertahan: " + estimasiBulanBertahan);
        System.out.println("Status Keuangan: " + statusKeuangan);
        System.out.println("Nilai absolut dari hutang: " + abshutang);
        System.out.println("Pengeluaran harian setelah pembulatan: " + pembulatanRataHarian);
        System.out.println("Bonus tak terduga: " + bonusTakTerduga);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: " + (jumlahUangInt - estimasiSisaSebulan + bonusTakTerduga) + "\n");
    }
}
