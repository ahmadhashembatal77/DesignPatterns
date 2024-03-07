package javaStuff.polymorphism;


/**
 * when you have methods in child class like eat method in Dog override methode from parent class
 * it's do the same thing in different form that we call polymorphism
 * the dog eat in different way then the animal does

 * another things in polymorphism that is Overloading is when you have two methods in a class
 * that have exactly the same name but take different parameter
 */
public class MainPolymorphism {
        public static void main(String[] args) {
           AnimalForPolymorphism animal = new AnimalForPolymorphism();
           animal.eat();

           Cat cat = new Cat();
           cat.eat();

           Dog dog = new Dog();
           dog.eat();
           dog.eat(100);
        }
}
