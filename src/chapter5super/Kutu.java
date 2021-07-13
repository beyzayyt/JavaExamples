package chapter5super;

public class Kutu {
    double en;
    double boy;
    double yukseklik;

    Kutu(double e, double b, double y) {

        en = e;
        boy = b;
        yukseklik = y;

    }
    public double hacimHesapla() {
        return en * boy * yukseklik;
    }

}
