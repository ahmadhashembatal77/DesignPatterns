package javaD.oop.upcasting_and_downcasting;

public class MainUDC {
    public static void main(String[] args) {

        AnimalUDC animal = new DogUDC();
        animal.eat();

        DogUDC dog = new DogUDC();

        CatUDC cat = new CatUDC();


        doAnyThing(animal);
        doAnyThing(dog);
//        doAnyThing(cat);
        doAnyThing2(cat);
    }

    private static void doAnyThing(AnimalUDC animal) {
        animal.eat();

        if(animal instanceof DogUDC dog){
            dog.eat(100);
            dog.eat();
        }
    }

    private static void doAnyThing2(CatUDC animal) {
        animal.eat();
    }
}
