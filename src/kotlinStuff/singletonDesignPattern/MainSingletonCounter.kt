package kotlinStuff.singletonDesignPattern

fun main() {

    // From Java To Kotlin
//    val counter1: SingletonCounterK? = SingletonCounterK.getInstance()
//    val counter2: SingletonCounterK? = SingletonCounterK.getInstance()
//
//    counter1?.addOne()
//    counter2?.addOne()
//    counter1?.addOne()
//    counter2?.addOne()
//    println("counter 1  " + counter1?.count)
//    println("counter 2  " + counter2?.count)
//    counter1?.addOne()
//    counter2?.addOne()
//    counter1?.addOne()
//    counter2?.addOne()
//    println("counter 1  " + counter1?.count)
//    println("counter 2  " + counter2?.count)


    // Kotlin Singleton Class

    val firstOne= KotlinSingletonCounter
    val secondOne= KotlinSingletonCounter
    firstOne.addOne()
    secondOne.addOne()
    println(firstOne.getCount())
    println(secondOne.getCount())

}