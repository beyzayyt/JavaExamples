package chapter5overriding;

public class Main {
    public static void main(String[] args) {
//        B object = new B();
//        object.show();
//        A object = new B();
//        object.show();
        İnsan beyza = new İnsan();
        Muhendis beyza1 = new Muhendis();
        beyza.boy = 161;
        beyza.kilo = 49;
        beyza1.boy=161;
        beyza1.kilo=49;
        beyza1.maas = 1000;
        System.out.println(beyza1.Maas());
        System.out.println(beyza1.yemek());
        System.out.println(beyza.yemek());


    }
}
