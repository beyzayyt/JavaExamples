package chapter5;

public class Main {
    public static void main(String[] args) {
//        Zaman zamanNesnesi = new Zaman();
//        zamanNesnesi.ilerle();
//        zamanNesnesi.zamaniYaz();

        Zaman zaman1 = new Zaman();
        zaman1.ilerle(3);
        zaman1.zamaniYaz();

        Zaman zaman2 = new Zaman();
        zaman2.ilerle();
        zaman2.zamaniYaz();
    }
}
