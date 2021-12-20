package Singleton;

public class TestEagerInitialization {
    public static void main(String[] args) {
        SingletonExampleEagerInitialization singletonExampleEagerInitialization1 = SingletonExampleEagerInitialization.getInstance();
        SingletonExampleEagerInitialization singletonExampleEagerInitialization2 = SingletonExampleEagerInitialization.getInstance();

        SingletonExampleEagerInitialization2 singletonExampleEagerInitialization3 = SingletonExampleEagerInitialization2.getInstance();
        SingletonExampleEagerInitialization2 singletonExampleEagerInitialization4 = SingletonExampleEagerInitialization2.getInstance();

        System.out.println("testEager-new");

        System.out.println("singletonExampleEagerInitialization1 ==> " + singletonExampleEagerInitialization1);
        System.out.println("singletonExampleEagerInitialization2 ==> " + singletonExampleEagerInitialization2);

        System.out.println("testEager-static bloc");

        System.out.println("singletonExampleEagerInitialization3 ==> " + singletonExampleEagerInitialization3);
        System.out.println("singletonExampleEagerInitialization4 ==> " + singletonExampleEagerInitialization4);
    }
}
