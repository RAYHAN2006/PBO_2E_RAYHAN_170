class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    public void serang(KarakterGame target) {
        super.serang(target, "Snake Bite", 15);
    }
}
