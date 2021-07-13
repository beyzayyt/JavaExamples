package chapter5static;


public class Main {
    public static void main(String[] args) {
//        A a1 = new A();
//        a1.olguDegiskenineEkle(5);
//        System.out.println(a1.getOlguDegiskeni());

//        A.sinifDegiskenineEkle(7);
//        System.out.println("a1 - Sınıf değişkeni: " + a1.getSinifDegiskeni());
//        System.out.println("a1 - Sınıf değişkeni: " + A.getSinifDegiskeni());

        /*System.out.println("Oyuncu sayısı: " + Oyuncu.kacOyuncuVar());
        Oyuncu o1 = new Oyuncu();
        Oyuncu o2 = new Oyuncu();
        Oyuncu o3 = new Oyuncu();
        System.out.println("Oyuncu sayısı: " + Oyuncu.kacOyuncuVar());
        o1.oyundanCik();
        System.out.println("Oyuncu sayısı: " + Oyuncu.kacOyuncuVar());*/

        Yazar yazar = new Yazar("beyza", "yyt");
        System.out.println(yazar.getBilgi());
        System.out.println(yazar.toString());

        Yazar[] yazarlar = YazarIslemleri.getYazarlar();
        for (int i = 0; i < yazarlar.length; ++i) {
            System.out.println(i + 1 + " - " + yazarlar[i].getBilgi());
        }

    }
}


class A {
    private int olguDegiskeni;
    private static int sinifDegiskeni;

    public int getOlguDegiskeni() {
        return olguDegiskeni;
    }

    public void olguDegiskenineEkle(int sayi) {
        olguDegiskeni += sayi;
    }

    public static void sinifDegiskenineEkle(int sayi) {
        sinifDegiskeni += sayi;
    }

    public static int getSinifDegiskeni() {
        return sinifDegiskeni;
    }
}

class Oyuncu {
    private static int oyuncuSayisi;

    public Oyuncu() {
        Oyuncu.oyuncuSayisi++;
    }

    public void oyundanCik() {
        Oyuncu.oyuncuSayisi--;
    }

    public static int kacOyuncuVar() {
        return Oyuncu.oyuncuSayisi;
    }
}

class Yazar {
    private String name;
    private String surname;

    public Yazar(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }


    public String getBilgi() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

class YazarIslemleri {
    private static Yazar[] yazarlar;

    static {
        yazarlar = new Yazar[1];
        yazarlar[0] = new Yazar("beyza", "yyt");
    }


    public static Yazar[] getYazarlar() {
        return YazarIslemleri.yazarlar;
    }


}
