package Singleton;

public class Singleton_lazy2 {
    private static Singleton_lazy2 instance;
    private Singleton_lazy2(){}
    public static synchronized Singleton_lazy2 getInstance() {
        if (instance == null) {
            instance = new Singleton_lazy2();
        }
        return instance;
    }
}
