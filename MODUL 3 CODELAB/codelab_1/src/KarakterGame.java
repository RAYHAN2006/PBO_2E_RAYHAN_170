class KarakterGame {
    protected String nama;
    protected int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target, String senjata, int damage) {
        System.out.println(nama + " menyerang " + target.nama + " menggunakan " + senjata + "!");
        target.terimaSerangan(damage);
    }

    public void terimaSerangan(int damage) {
        kesehatan -= damage;
        System.out.println(nama + " sekarang memiliki kesehatan " + kesehatan);
    }
}
