package brainfuck.runtime

import brainfuck.impl.runtime.context.BFContextBuilder

interface Context {

    companion object {
        val DEFAULT_MAX_STACK_SIZE = 1_000
        val DEFAULT_MAX_CYCLE_COUNT = 30_000

        // simulate constructor with builder
        operator fun invoke(builder: ContextBuilder.() -> Unit) = BFContextBuilder().apply(builder).build()
    }

    fun read(): Int
    fun write(o: Int)

    fun increment()
    fun decrement()
    fun shiftLeft()
    fun shiftRight()

    fun getState(): Int
    fun setState(o: Int)

    fun reset()

}