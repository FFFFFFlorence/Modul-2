import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String nama;
        int NIM;
        int usia;
        int jumlahMatkul;
        double totalNilai = 0;
        double IPK;
        int antrian;
        boolean perbandinganUsia;
        boolean perbandingan;
        
        System.out.print("Masukkan Nama : ");
        try (Scanner input = new Scanner(System.in)) {
            nama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            NIM = input.nextInt();
            System.out.print("Masukkan Usia : ");
            usia = input.nextInt();
            System.out.print("Masukkan Jumlah Mata Kuliah : ");
            jumlahMatkul = input.nextInt();
            
            
            for (int i = 0; i < jumlahMatkul; i++) {
                System.out.print("Masukkan Nilai Mata Kuliah ke-" + (i + 1) + " : ");
                double temp = input.nextDouble();
                
                if (temp >= 90) {
                    temp = 4.0;
                } else if (temp >= 85) {
                    temp = 3.7;
                } else if (temp >= 80) {
                    temp = 3.3;
                } else if (temp >= 75) {
                    temp = 3.0;
                } else if (temp >= 70) {
                    temp = 2.7;
                } else if (temp >= 65) {
                    temp = 2.3;
                } else if (temp >= 60) {
                    temp = 2.0;
                } else if (temp >= 55) {
                    temp = 1.7;
                } else if (temp >= 50) {
                    temp = 1.3;
                } else if (temp >= 45) {
                    temp = 1.0;
                }
                
                totalNilai += temp;
            }
            
            IPK = totalNilai / jumlahMatkul;
            
            perbandinganUsia = usia > 22;
            perbandingan = false;
            
            if (IPK >= 3.5 && jumlahMatkul > 4){
                perbandingan = true;
            } else if (IPK < 2.5 && jumlahMatkul < 4){
                perbandingan = true;
            }
            
            antrian = (int)(Math.random() * 25);
            
            System.out.println("\n===EVALUASI AKADEMIK===");
            System.out.println("Nama \t\t: " + nama);
            System.out.println("NIM \t\t: " + NIM);
            System.out.println("Usia \t\t: " + usia);
            System.out.println("Jumlah Matkul \t: " + jumlahMatkul);
            System.out.println("IPK \t\t: " + IPK);
            System.out.println("Nomor antrian \t: " + antrian);
            System.out.println("Usia mahasuswa melebihi dari 22 tahun? " + perbandinganUsia);
            System.out.println("(IPK >= 3.5) dan (jumlah matkul > 4)? " + perbandingan + "\n");
        }
    }
}
