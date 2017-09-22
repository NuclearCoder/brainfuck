package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import brainfuck.runtime.Output

internal object BFNullaryInput : Input {
    override fun read() = 0
}

internal object BFNullaryOutput : Output {
    override fun write(o: Int) = Unit
}