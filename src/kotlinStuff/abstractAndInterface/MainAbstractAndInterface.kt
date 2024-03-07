package kotlinStuff.abstractAndInterface

// we can not make object from abstract class

// we can make the function inside the abstract force to use by using "abstract"
// word behind the void word

// we can make the abstract method in kotlin usable in class who extend it
// by putting open before function or variable

// the diff between abstract and interface
// 1 : the variables in interface must be final
// 2 : the methods in interface force to use
// 3: we can not make the methods inside the interface with body

fun main(){
    val cat = Cat()
    cat.age = 10
    cat.name = "memo"
    cat.makeNoise()
    cat.poop()
    cat.eat()
    cat.eye()
    println(cat.swim())
    cat.jump()
    println(cat.name)
    println(cat.age)
    println(cat.catNickname)
    cat.catNickname = "geranld"
    println(cat.catNickname)
}