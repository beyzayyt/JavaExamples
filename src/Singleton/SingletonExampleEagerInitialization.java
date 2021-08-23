package Singleton;

public class SingletonExampleEagerInitialization {

    //new SingletonExample
    private static SingletonExampleEagerInitialization instance = new SingletonExampleEagerInitialization();

    private SingletonExampleEagerInitialization() {
    }

    public static SingletonExampleEagerInitialization getInstance() {
        return instance;
    }
}


