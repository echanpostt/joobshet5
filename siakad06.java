import java.util.Scanner;
public class siakad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUas, nilaiUts, nilaiAkhir,nilaiKualifikasi;
        String nilaiHuruf;

         System.out.println("masukkan nama: ");
         nama = sc.nextLine();
         System.out.println("masukkan nim:");
         nim = sc.nextLine();
         System.out.println("masukkan kelas:");
         kelas = sc.nextLine();
         System.out.println("masukkan absen: ");
         absen = sc.nextByte();
         System.out.println("masukkan nilai kuis:");
         nilaiKuis = sc.nextDouble();
         System.out.println("masukkan nilai tugas: ");   
         nilaiTugas = sc.nextDouble();
         System.out.println("masukkan nilai uts: ");   
         nilaiUts = sc.nextDouble();
         System.out.println("masukkan nilai uas: ");
         nilaiUas = sc.nextDouble();
         
         nilaiAkhir = (0.20 * nilaiKuis) + (0.15 * nilaiTugas) + (0.35 * nilaiUas) + (0.30 * nilaiUts);

         if (nilaiAkhir >= 80) {
            nilaiKualifikasi = 4;
            nilaiHuruf = "A";
         } else if (nilaiAkhir >= 73) {
            nilaiKualifikasi = 3;
            nilaiHuruf = "B+";
         } else if (nilaiAkhir >= 65) {
            nilaiKualifikasi = 3;
            nilaiHuruf = "B";
         }
          else if (nilaiAkhir >= 60) {
            nilaiKualifikasi = 2;
            nilaiHuruf = "C+";
         } else if (nilaiAkhir >= 50) {
            nilaiKualifikasi = 1;
            nilaiHuruf = "C";
         } else if (nilaiAkhir >= 39) {
            nilaiKualifikasi = 1;
            nilaiHuruf = "D";
         } else {
            nilaiKualifikasi = 0;
            nilaiHuruf = "E";
         }
         System.out.println("nama: " + nama + " nim: " + nim);
         System.out.println("kelas: " + kelas + " absen: " + absen);
         System.out.println("Nilai akhir: " + nilaiAkhir);
         System.out.println("Nilai kualifikasi: " + nilaiKualifikasi);
         System.out.println("Nilai huruf: " + nilaiHuruf);
         

         
}
}
