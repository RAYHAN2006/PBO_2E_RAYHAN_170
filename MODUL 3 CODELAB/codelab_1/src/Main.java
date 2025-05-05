public class Main {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Status awal:");
        System.out.println(brimstone.nama + " memiliki kesehatan: " + brimstone.kesehatan);
        System.out.println(viper.nama + " memiliki kesehatan: " + viper.kesehatan);

        // Serangan Brimstone ke Viper
        brimstone.serang(viper);

        // Serangan Viper ke Brimstone
        viper.serang(brimstone);
    }
}
