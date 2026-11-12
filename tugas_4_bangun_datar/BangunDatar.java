public class BangunDatar {
    // Method dasar, akan di-override oleh subclass
    // (protected agar bisa di-override; private tidak bisa di-override)
    protected float luas() {
        return 0;
    }

    protected float keliling() {
        return 0;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}
