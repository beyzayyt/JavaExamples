package chapter5overriding;

public class B extends A {
    public void show() {
        super.show();
        System.out.println("in B");
    }
}
