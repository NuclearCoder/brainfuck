package brainfuck.impl.runtime.io

import brainfuck.runtime.Input
import brainfuck.runtime.Output

internal class BFDebugInput(private val input: Input) : Input {
    override fun read(): Int {
        val o = input.read()
        println("Read $o")
        return o
    }
}

internal class BFDebugOutput(private val output: Output) : Output {
    override fun write(o: Int) {
        println("Write $o")
        output.write(o)
    }
}