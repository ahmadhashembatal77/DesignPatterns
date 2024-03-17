package javaD.oop.abstractAndInterface;


/* we can not make object from abstract or interface class */

/* you can extend just one abstract class, and implement more than one interface */

/*
 we can make the function inside the abstract force to use by using "abstract"
 word behind the void word
*/

/*
 we can make the abstract method in kotlin usable in class who extend it
 by putting open before function or variable
*/

/*
 the diff between abstract and interface
 1 : the variables in interface must be final
 2 : the methods in interface force to use
 3: we can not make the methods inside the interface with body, but we can in abstract
 */

/*
Inheritance : is the ability to build new classes on top of existing ones.
The main benefit of inheritance is code reuse
*/

/** When to Use:
*use an abstract class when you want to provide a common base with some shared
*implementation for subclasses.

*use an interface when you want to define a contract that multiple
*unrelated classes can adhere to.
*/

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.age = 10;
        cat.name = "memo";
        System.out.println(cat.makeNoise());

        // with super override
        cat.Poop();
        // with custom body
        cat.eat();
        System.out.println(cat.swim());

        cat.jump();
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.catNickname);

        cat.catNickname = "geranld";
        System.out.println(cat.catNickname);
    }
}