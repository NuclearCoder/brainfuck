package brainfuck.impl.runtime.io

import brainfuck.runtime.Output

internal class BFAppendableOutput(private val output: Appendable) : Output {
    override fun write(o: Int) {
        output.append(o.toChar())
    }
}