package chapter5test;


public class Main {
    public static void main(String[] args) {
        Test testing = new Test();
        testing.beyzaa();
        testing.beyzayyt();
    }
}

class Test {
    public int b;
    Test test1 = new Test();

    public void beyzaa() {
        System.out.println("public func");
    }

    protected void beyzayyt() {
        System.out.println("protected func");
    }

    private void beyz() {
        System.out.println("private func");
    }

}


