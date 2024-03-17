package javaD.oop.abstractAndInterface;

public abstract class Animal {
    int age = 1;
    String name = "base cat";

    public abstract String makeNoise();

    public void Poop() {
        System.out.println("The Animal Poop Now....");
    }

    public void eat() {
        System.out.println("The Animal eating Now....");
    }
}
