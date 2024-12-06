package org.jetbrains.greeting

import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi" else "Hello")
        add("Guess what it is ${platform.name.reversed()}")
    }
}