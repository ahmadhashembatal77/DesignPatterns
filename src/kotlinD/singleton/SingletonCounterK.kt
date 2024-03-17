package kotlinD.singleton

import kotlin.concurrent.Volatile

// Make Private Constructor to not make any one create Instance from it.
class SingletonCounterK private constructor() {
    var count = 0
    fun addOne() { count++ }
    companion object {
        @Volatile
        private var instance: SingletonCounterK? = null

        fun getInstance(): SingletonCounterK? {
            // just this if way named Lazy Initialization
            if (instance == null) {
                synchronized(SingletonCounterK::class.java) {
                    if (instance == null) {
                        instance = SingletonCounterK()
                    }
                }
            }
            return instance
        }
    }
}