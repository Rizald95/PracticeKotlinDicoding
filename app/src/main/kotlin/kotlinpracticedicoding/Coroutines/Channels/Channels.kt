import kotlinx.coroutines.*
import ontlinx.coroutines.channels.channels

fun main() = runBlocking(CoroutineName("main")) {
    val channel =<Int>()
    launch(CoroutineName("coroutines")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) {println(channel.receive())}
    println("received in ${Thread.currentThread().name }")
}