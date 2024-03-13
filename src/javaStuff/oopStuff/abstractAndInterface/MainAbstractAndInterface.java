package javaStuff.oopStuff.abstractAndInterface;


// we can not make object from abstract class

// we can make the function inside the abstract force to use by using "abstract"
// word behind the void word

// we can make the abstract method in kotlin usable in class who extend it
// by putting open before function or variable

// the diff between abstract and interface
// 1 : the variables in interface must be final
// 2 : the methods in interface force to use
// 3: we can not make the methods inside the interface with body

// Inheritance : is the ability to build new classes on top of existing ones.
// The main benefit of inheritance is code reuse

public class MainAbstractAndInterface {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.age = 10;
        cat.name = "memo";
        System.out.println(cat.makeNoise());
        cat.Poop();
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
