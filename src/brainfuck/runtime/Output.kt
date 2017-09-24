package brainfuck.runtime

import brainfuck.impl.runtime.io.BFAppendableOutput
import brainfuck.impl.runtime.io.BFDebugOutput
import brainfuck.impl.runtime.io.BFNullaryOutput
import brainfuck.impl.runtime.io.BFSystemOutput

interface Output {

    companion object {
        val NULLARY: Output = BFNullaryOutput
        val SYSTEM: Output = BFSystemOutput
        fun of(output: Appendable): Output = BFAppendableOutput(output)
    }

    fun write(o: Int)

    fun toDebug(): Output = BFDebugOutput(this)

}