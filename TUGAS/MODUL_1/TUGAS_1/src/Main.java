import java.util.Scanner;

public class Main {
    private static Scanner penginput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Login:\n1. Admin\n2. Mahasiswa\nMasukkan Pilihan:");
            int pilihan = penginput.nextInt();
            penginput.nextLine();
            switch (pilihan) {
                case 1:
                    admin();
                    break;
                case 2:
                    mahasiswa();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void admin() {
        System.out.println("Masukkan username: ");
        String usernameAdmin = penginput.nextLine();
        System.out.println("Masukkan Password: ");
        String passwordAdmin = penginput.nextLine();

        if (usernameAdmin.equals("admin170") && passwordAdmin.equals("password170")) {
            System.out.println("Login Admin Berhasil!");
            System.exit(0);
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void mahasiswa() {
        System.out.println("Masukkan username: ");
        String usernamemahasiswa = penginput.nextLine();
        System.out.println("Masukkan NIM: ");
        String passwordmahasiswa = penginput.nextLine();

        if (usernamemahasiswa.equals("Maulana Rayhan Zulkarnaen" ) && passwordmahasiswa.equals("202410370110170")) {
            System.out.println("Login Mahasiswa Berhasil!");
            System.out.println("Nama : "+usernamemahasiswa);
            System.out.println("NIM : "+passwordmahasiswa);
            System.exit(0);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}