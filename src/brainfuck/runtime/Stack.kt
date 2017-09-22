package brainfuck.runtime

interface Stack {
    fun get(): Int
    fun set(x: Int)
    fun shiftLeft()
    fun shiftRight()
    fun clear()
}