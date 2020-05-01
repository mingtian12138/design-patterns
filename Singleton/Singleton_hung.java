package Singleton;

public class Singleton_hung {
    private static Singleton_hung instance = new Singleton_hung();
    private Singleton_hung(){}
    public static Singleton_hung getInstance() {
        return instance;
    }
}
