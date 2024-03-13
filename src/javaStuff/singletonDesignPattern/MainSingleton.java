package javaStuff.singletonDesignPattern;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonCounter counter1 = SingletonCounter.GetInstance();
        SingletonCounter counter2 = SingletonCounter.GetInstance();
        SingletonCounter counter3 = SingletonCounter.GetInstance();
        SingletonCounter counter4 = SingletonCounter.GetInstance();
        SingletonCounter counter5 = SingletonCounter.GetInstance();

        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();
        counter4.AddOne();
        counter5.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();
        counter5.AddOne();

        System.out.println("counter 1  " + counter1.count);
        System.out.println("counter 2  " + counter2.count);
        System.out.println("counter 3  " + counter3.count);
        System.out.println("counter 4  " + counter4.count);
        System.out.println("counter 5  " + counter5.count);

        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();
        counter4.AddOne();
        counter5.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();
        counter5.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        counter3.AddOne();

        System.out.println("counter 1  " + counter1.count);
        System.out.println("counter 2  " + counter2.count);
        System.out.println("counter 3  " + counter3.count);
        System.out.println("counter 4  " + counter4.count);
        System.out.println("counter 5  " + counter5.count);
    }
}
