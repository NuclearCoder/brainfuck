package brainfuck.impl.runtime.io

import brainfuck.runtime.Input

internal class BFStringInput(private val input: CharSequence) : Input {
    private var cursor: Int = -1
    override fun read(): Int {
        cursor++
        if (cursor >= input.length)
            throw NoSuchElementException("No more input chars to read")
        return input[cursor].toInt()
    }
}

