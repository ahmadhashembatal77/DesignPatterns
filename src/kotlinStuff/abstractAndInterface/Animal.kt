package kotlinStuff.abstractAndInterface

abstract class Animal {
    var age = 1
    var name = "base cat"

    abstract fun makeNoise()

    open fun eye(): String { return "this cat watch things very good" }

    open fun poop() { println("The Animal Poop Now....") }

    fun eat() { println("The Animal eating Now....") }
}

