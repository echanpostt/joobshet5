import java.util.Scanner;
/**
 * PemilihanBilangan06
 */
public class PemilihanBilangan06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println(angka + " adalah " + hasil);
    }
}