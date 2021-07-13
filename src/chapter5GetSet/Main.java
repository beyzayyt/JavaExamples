package chapter5GetSet;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.ilerle();
        test1.zamaniYaz();

    }
}

class Test1 {
    private int saat;

    public Test1() {
        saat = 0;

    }

    public Test1(int st) {
        setSaat(st);
    }

    public void ilerle() {
        saat++;
    }

    public void setSaat(int st) {
        if (st >= 0 && st < 24) {
            saat = st;
        }
    }

    public int getSaat() {
        return saat;
    }

    public void zamaniYaz() {
        System.out.println("Şu anki zaman: " +
                saat);

    }


}
