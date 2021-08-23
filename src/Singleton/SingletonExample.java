package Singleton;

//lazy initialization
public class SingletonExample {

    //There is a static member of the same type as the class
    private static SingletonExample instance;

    //private constructor is defined
    private SingletonExample() {
    }

    /**
     * there is a static method to reach static member
     * this method gives same instance every time
     */
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}

class Test {
    public static void main(String[] args) {

        //create instances
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println("singletonExample1 ==> " + singletonExample1);
        System.out.println("singletonExample2 ==> " + singletonExample2);
    }
}
