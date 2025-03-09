import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner
        scanner.close();

        // Menghitung umur
        int tahunSekarang = Year.now().getValue();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminString;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminString = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminString = "Perempuan";
        } else {
            jenisKelaminString = "Tidak diketahui";
        }

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminString);
        System.out.println("Umur          : " + umur + " tahun");
    }
}