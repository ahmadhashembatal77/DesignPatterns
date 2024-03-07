package javaStuff.upcasting_and_downcasting;

public class MainForUpCastingAndDownCasting {
    public static void main(String[] args) {
        AnimalForUpCastingAndDownCasting animal = new DogForUpCastingAndDownCasting();
        animal.eat();

        DogForUpCastingAndDownCasting dog = new DogForUpCastingAndDownCasting();

        CatForUpCastingAndDownCasting cat = new CatForUpCastingAndDownCasting();


        doAnyThing(animal);
        doAnyThing(dog);
//        doAnyThing(cat);
        doAnyThing2(cat);
    }

    private static void doAnyThing(AnimalForUpCastingAndDownCasting animal) {
        animal.eat();

        if(animal instanceof DogForUpCastingAndDownCasting dog){
            dog.eat(100);
            dog.eat();
        }
    }

    private static void doAnyThing2(CatForUpCastingAndDownCasting animal) {
        animal.eat();
    }
}
