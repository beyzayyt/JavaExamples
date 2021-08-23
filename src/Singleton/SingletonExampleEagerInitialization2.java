package Singleton;

public class SingletonExampleEagerInitialization2 {

    private static SingletonExampleEagerInitialization2 instance;

    //initialization with static bloc
    static {
        instance = new SingletonExampleEagerInitialization2();
    }

    private SingletonExampleEagerInitialization2() {
    }

    public static SingletonExampleEagerInitialization2 getInstance() {
        return instance;
    }
}
