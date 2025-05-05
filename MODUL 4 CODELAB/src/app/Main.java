package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Buat objek buku
        Buku buku1 = new NonFiksi("Filosofi Teras", "Henry Manampiring", "Kesehatan mental");
        Buku buku2 = new Fiksi("Perahu Kertas", "Dee Lestari", "Romance");

        // Tampilkan info buku
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Buat objek anggota
        Anggota anggota1 = new Anggota("Maulana Rayhan Zulkarnaen", "E170");
        Anggota anggota2 = new Anggota("Muhammad Syakhish Al Hanif", "E189");

        // Tampilkan info anggota
        System.out.println("Anggota: " + anggota1.getNama() + " (ID: " + anggota1.getIdAnggota() + ")");
        System.out.println("Anggota: " + anggota2.getNama() + " (ID: " + anggota2.getIdAnggota() + ")");
        System.out.println();

        // Contoh peminjaman dan pengembalian
        anggota1.pinjamBuku("Filosofi Teras");
        anggota2.pinjamBuku("Perahu Kertas", 7);
        System.out.println();

        anggota1.kembalikanBuku("Filosofi Teras");
        anggota2.kembalikanBuku("Perahu Kertas");
    }
}