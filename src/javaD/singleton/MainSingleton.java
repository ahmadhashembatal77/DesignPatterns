package javaD.singleton;


/** Singleton

 * A singleton is a design pattern that ensures a class has only one instance
 * throughout the application’s lifecycle

 * Why Use volatile and synchronized in Singleton?
 * Let’s explore the reasons:
 * volatile Keyword:
 * The volatile keyword ensures that a variable is always read and written directly
 from/to the main memory.

 * In the context of singletons, marking the instance field as volatile ensures
 that changes made to the singleton are immediately visible to other threads.

 * And that will help us to not make any conflict when the app running by create
 instance twice, because the volatile will make the app know directly if there
 are instance or not

 * Without volatile, there might be visibility issues where one thread doesn’t see
 the updated value of the singleton instance.

 *The synchronized keyword provides mutual exclusion and ensures that modifications
 guarded by the lock synchronize with the main memory.

 * In our singleton, the synchronized block ensures that only one thread at a
 time can create the instance.
 * */

public class MainSingleton {
    public static void main(String[] args) {
        SingletonCounter counter1 = SingletonCounter.GetInstance();
        SingletonCounter counter2 = SingletonCounter.GetInstance();
        counter1.AddOne();
        counter2.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        System.out.println("counter 1  " + counter1.count);
        System.out.println("counter 2  " + counter2.count);
        counter1.AddOne();
        counter2.AddOne();
        counter1.AddOne();
        counter2.AddOne();
        System.out.println("counter 1  " + counter1.count);
        System.out.println("counter 2  " + counter2.count);
    }
}
