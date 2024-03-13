package kotlinStuff.otherStuffs


/**
 * Purpose and Behavior:
 * The @Volatile annotation is used to control the memory visibility of variables in multi-threaded scenarios.
 *
 * When applied to a property, it marks the JVM backing field of that property as volatile.
 *
 * Volatile properties ensure that writes to the field are immediately visible to other threads,
 * and reads always see the latest changes.
 *
 * In essence, @Volatile serves the same purpose as Java’s volatile keyword.
 * */

object TaskExecutor : Runnable {

    //we guarantee that changes to shouldContinue are visible across threads,
    // preventing any unexpected behavior due to processor optimizations or caching.

    @Volatile
    private var shouldContinue = true

    override fun run() {
        while (shouldContinue) {
            // Busy-wait
            Thread.sleep(500)
            println("TaskExecutor: Busy-wait")
        }
        println("TaskExecutor: Done")
    }

    fun stop() {
        shouldContinue = false
    }
}

fun main() {
    val thread = Thread(TaskExecutor)
    thread.start()

    // Simulate stopping the task after some time
    Thread.sleep(2000) // Wait for 2 seconds
    TaskExecutor.stop()

    thread.join() // Wait for the thread to finish
}