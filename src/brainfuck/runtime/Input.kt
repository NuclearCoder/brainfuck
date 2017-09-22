package brainfuck.runtime

import brainfuck.impl.runtime.io.BFDebugInput
import brainfuck.impl.runtime.io.BFNullaryInput
import brainfuck.impl.runtime.io.BFReaderInput
import brainfuck.impl.runtime.io.BFSystemInput
import java.io.Reader

interface Input {

    companion object {
        val NULLARY: Input = BFNullaryInput
        val SYSTEM: Input = BFSystemInput
        fun ofReader(reader: Reader): Input = BFReaderInput(reader)
    }

    fun read(): Int

    fun toDebug(): Input = BFDebugInput(this)

}