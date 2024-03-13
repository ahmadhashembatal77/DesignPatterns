package javaStuff.oopStuff.abstractAndInterface;

public class Cat extends Animal implements AnimalStuff {
    // we get nickname from AnimalStuff, but we can not change the name
    String catNickname = nickname;
    @Override
    public void eat() {
        System.out.println("the cat eating now");
    }
    @Override
    public void Poop() {
        super.Poop();
    }
    @Override
    public String makeNoise() {
        return "Meow";
    }

    @Override
    public void jump() {
        System.out.println("cat jump highly");
    }

    @Override
    public String swim() {
        return "cat can swim but do not like swim";
    }
}