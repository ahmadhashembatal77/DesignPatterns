package kotlinD.singleton

/** Singleton with object:
 * When you declare an object using the object keyword,
 Kotlin automatically ensures that only one instance of that
 object exists throughout the application’s lifetime.

 * The object itself acts as a singleton, and there is no need for
 explicit synchronization or volatile variables.

 * Memory Visibility:
 * In the case of an object, the instance is created lazily when it’s first accessed.

 * Kotlin guarantees proper memory visibility for the initialization of the object.

 * It ensures that other threads see the fully initialized instance once it’s created.

 * Lazy Initialization:
 * The object is initialized lazily, meaning it’s created only when needed
 (i.e., when you access any property or function within it).

 * This lazy initialization is thread-safe by design, and you don’t need to worry
 about synchronization.

 * Conclusion:
 * For singleton instances created using object, you can safely omit explicit
 synchronization or @Volatile.

 * Your SingletonCounterK implementation is already thread-safe without any
 additional annotations.
 * */

object KotlinSingletonCounter {
    private var _count = 0

    fun addOne() {
        _count++
        println(_count)
    }

    fun getCount(): Int{
        return _count
    }
}