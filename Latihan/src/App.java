
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double ipk = 4.0;
        char inisial = 'F';
        String nama = "Fulan";
        System.out.println("nama : " + nama + "Umur :" + umur + "IPK :" + ipk + "Inisial :" + inisial);

        byte nomorByte = -128;
        short nomorShort = 32767;
        long nomorLong = 1000000000;
        float phi = 3_14f;

        System.out.println(nomorByte);
        System.out.println(nomorShort);
        System.out.println(nomorLong);
        System.out.println(phi);

        boolean isJavaFun = true;

        System.err.println(isJavaFun);

        char var1 = 65;

        System.out.println(var1);

        String firstName = "Florence";
        String lastName = "Lake";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        System.out.println("Masukan nama anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukan umur Anda: ");
        int age = input.nextInt();
        System.out.println("Masukan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukan: ");
        System.out.println("Nama Anda: " + name);
        System.out.println("Umur Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        input.close();
    }
}
