package javaD.oop.polymorphism;

public class DogP extends AnimalP {
    @Override
    public void eat() {
        System.out.println("NOKH NOKH");
    }

    // OverLoading
    public void eat(int number){
        System.out.println("number = " + number);
    }
}
