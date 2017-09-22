package brainfuck.impl.runtime

import brainfuck.runtime.Stack

internal class BFStack(private val size: Int) : Stack {

    private val data = IntArray(size)
    private var cursor = 0

    // for lazy reset
    private var maxRight = 0

    override fun get(): Int {
        return data[cursor]
    }

    override fun set(x: Int) {
        data[cursor] = x
    }

    override fun shiftLeft() {
        cursor--
        checkBounds()
    }

    override fun shiftRight() {
        cursor++
        checkBounds()

        if (cursor > maxRight) {
            data[cursor] = 0
            maxRight = cursor
        }
    }

    override fun clear() {
        cursor = 0
        data[cursor] = 0
        maxRight = cursor
    }

    private fun checkBounds() {
        if (cursor !in (0 until size)) {
            throw IndexOutOfBoundsException("Cursor exceeded stack bounds (0..${size - 1})")
        }
    }

}