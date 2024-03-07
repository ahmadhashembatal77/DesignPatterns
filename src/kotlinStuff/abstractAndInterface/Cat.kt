package kotlinStuff.abstractAndInterface

import javaStuff.abstractAndInterface.AnimalStuff

class Cat: Animal(), AnimalStuff {
    // we get nickname from AnimalStuff, but we can not change the name
    var catNickname = AnimalStuff.nickname

    override fun jump() { println("this cat can jump") }

    override fun swim(): String { return "can swim" }

    override fun makeNoise() { println("it's make a lot of noises") }

    override fun eye(): String { return "good eye" }

    override fun poop() {
        super.poop()
        println("SecondPoopPrint")
    }
}