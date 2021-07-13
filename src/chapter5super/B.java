package chapter5super;

public class B extends A {
    int i;

    B(int a, int b) {
        //i inside A
        super.i = a;
        i = b;
    }
    public void write(){
        System.out.println(super.i);
        System.out.println(i);
    }
}
