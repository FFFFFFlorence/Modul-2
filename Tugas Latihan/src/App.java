import  java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String Nama;
        int NIM;
        int usia;
        double tinggi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        Nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        NIM = input.nextInt();
        System.out.print("Masukkan Usia : ");
        usia = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = input.nextInt();

        System.out.println("\n" + "Usia: " + ((usia * 2)+10/5-3));
        boolean perbandinganUsia = usia > 18;
        System.out.println("Usia > 18: " + perbandinganUsia);
        boolean perbandinganTinggi = tinggi > 160;
        boolean perbandinganUsiaTinggi = perbandinganUsia && perbandinganTinggi;
        System.out.println("(Usia > 18) && (Tinggi > 160): " + perbandinganUsiaTinggi);
        double usiaInt = (double) usia;
        int tinggiDouble = (int) tinggi;
        System.out.println("Usia: " + usiaInt + "\n Tinggi: " + tinggiDouble + "\n");
    }
}
