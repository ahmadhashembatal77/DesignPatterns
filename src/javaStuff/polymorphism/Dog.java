package javaStuff.polymorphism;

public class Dog extends AnimalForPolymorphism{
    @Override
    public void eat() {
        System.out.println("NOKH NOKH");
    }

    // OverLoading
    public void eat(int number){
        System.out.println("number = " + number);
    }
}
