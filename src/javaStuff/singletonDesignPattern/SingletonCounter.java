package javaStuff.singletonDesignPattern;

public class SingletonCounter {

    public int count = 0;
    private volatile static SingletonCounter instance;

    // Make Private Constructor to not make any one create Instance from it.
    private SingletonCounter() {}

    public static SingletonCounter GetInstance() {
        // just this if way named Lazy Initialization
        if (instance == null) {
            synchronized (SingletonCounter.class) {
                if (instance == null) {
                    instance = new SingletonCounter();
                }
            }
        }
        return instance;
    }

    public void AddOne() {
        count++;
    }
}
