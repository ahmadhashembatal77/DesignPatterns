package javaD.oop.upcasting_and_downcasting;

public class DogUDC extends AnimalUDC {
    @Override
    public void eat() {
        System.out.println("NOKH NOKH");
    }

    // OverLoading
    public void eat(int number){
        System.out.println("number = " + number);
    }

    public void makeNoise(){System.out.println("Noise");}

}