class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    public void serang(KarakterGame target) {
        super.serang(target, "Orbital Strike", 20);
    }
}
