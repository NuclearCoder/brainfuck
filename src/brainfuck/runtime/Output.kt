package brainfuck.runtime

import brainfuck.impl.runtime.io.*
import java.io.Writer

interface Output {

    companion object {
        val NULLARY: Output = BFNullaryOutput
        val SYSTEM: Output = BFSystemOutput
        fun ofWriter(writer: Writer): Output = BFWriterOutput(writer)
        operator fun Output.plus(other: Output): Output = BFChainOutput(this, other)
    }

    fun write(o: Int)

    fun toDebug(): Output = BFDebugOutput(this)

}