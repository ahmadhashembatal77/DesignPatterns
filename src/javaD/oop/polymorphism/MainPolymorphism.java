package javaD.oop.polymorphism;


/** Polymorphism
 * when you have methods in child class like eat method in
 * Dog override methode from parent class
 * it's do the same thing in different way form that we call polymorphism
 * the dog eat in different way then the animal does

 * another things in polymorphism that is Overloading is when you have
 * two methods in a class
 * that have exactly the same name but take different parameter
 */
public class MainPolymorphism {
        public static void main(String[] args) {
           AnimalP animal = new AnimalP();
           animal.eat();

           /* no need to call the methods inside the cal class */
           CatP cat = new CatP();
           cat.eat();

           DogP dog = new DogP();
           dog.eat();
           dog.eat(100);
        }
}
