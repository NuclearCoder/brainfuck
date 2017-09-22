package brainfuck.impl.runtime.io

import brainfuck.runtime.Output

internal class BFChainOutput(private val out1: Output, private val out2: Output) : Output {
    override fun write(o: Int) {
        out1.write(o)
        out2.write(o)
    }
}