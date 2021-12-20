package chapter5overriding;

public class Child extends Parent {
    public Child() {
        System.out.println("Constructor of Child");
    }

    public void disp() {
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        //super.disp();
    }
}
