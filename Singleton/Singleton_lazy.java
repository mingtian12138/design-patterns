package Singleton;

public class Singleton_lazy {
    private static Singleton_lazy instance;
    private Singleton_lazy(){}

    public static Singleton_lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_lazy();
        }
        return instance;
    }
}
