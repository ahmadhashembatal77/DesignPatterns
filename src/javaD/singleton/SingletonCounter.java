package javaD.singleton;

public class SingletonCounter {

    public int count = 0;

    private volatile static SingletonCounter instance;

    // Make Private Constructor to not make any one create Instance from it.
    private SingletonCounter() {}

    public static SingletonCounter GetInstance() {
        // this way named Lazy Initialization.
        // make sure there are no instance.
        if (instance == null) {
            synchronized (SingletonCounter.class) {
                if (instance == null) {
                    instance = new SingletonCounter();
                }
            }
        }
        return instance;
    }

    public void AddOne() {count++;}
}
